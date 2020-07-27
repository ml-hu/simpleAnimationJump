package swu.hmliang.myapplication

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *   Activity用来管理界面的生命周期 和 交互
         *   具体的界面需要自己配置 res -> layout -> .xml
         *   通过setContentView来关联layout布局文件和Java/kotlin代码
         *   所有的资源文件都会有一个id和他对应 要访问这些资源
         *   R.layout.activity_main
         *   R.drawable.png
         *
         */
        setContentView(R.layout.activity_main)

        //监听按钮被点击的时间
        //mLoginBtn.setOnClickListener(this)
//        mLoginBtn.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(p0: View?) {
//                println("2.按钮被点击了")
//            }
//
//        })
//        mLoginBtn.setOnClickListener { view:View? ->
//            println("3.按钮被点击了")
//        }
        mLoginBtn.setOnClickListener {
            //ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f).also {

                //apply also with run
                //apply
                //直接在对象内部使用代码块 可以访问这个对象本身的属性和方法
                /*
                it.duration = 100
                it.repeatCount = 20
                it.start()
                it.addListener(object : Animator.AnimatorListener{
                    override fun onAnimationRepeat(p0: Animator?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onAnimationEnd(p0: Animator?) {
                        //界面跳转
                        startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                    }

                    override fun onAnimationCancel(p0: Animator?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                    override fun onAnimationStart(p0: Animator?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                })*/

            //}
            ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f).apply {
                duration = 100
                repeatCount = 6
                start()
                addListener(object : MyAnimatorListener(){
                    override fun onAnimationEnd(p0: Animator?) {
                        startActivity(Intent(this@MainActivity,
                            DetailActivity::class.java))
                    }
                })
            }
            /*
            //添加旋转动画 动画结束之后再跳转到下一个界面
            //旋转 平移 缩放 透明度
            val anim = ObjectAnimator.ofFloat(mHeader,"rotation",0f,360f)
            anim.duration = 100
            anim.repeatCount = 20
            anim.start()

            //监听动画的结束事件
            anim.addListener(object : Animator.AnimatorListener{
                override fun onAnimationRepeat(p0: Animator?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onAnimationEnd(p0: Animator?) {
                     //界面跳转
                    startActivity(Intent(this@MainActivity,DetailActivity::class.java))
                }

                override fun onAnimationCancel(p0: Animator?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onAnimationStart(p0: Animator?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

            })*/
            //界面跳转
            //startActivity(Intent(this,DetailActivity::class.java))


        }
    }

    override fun onClick(p0: View?) {
        println("1.按钮被点击了")

    }
}
