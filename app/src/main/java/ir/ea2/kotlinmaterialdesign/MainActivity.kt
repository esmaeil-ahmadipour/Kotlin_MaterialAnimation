package ir.ea2.kotlinmaterialdesign

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale)
        val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val scaleRotateAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_rotate)
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val fadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
        val translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate)


        ac_main_btn_fadeIn.setOnClickListener {
            ac_main_imageView.startAnimation(fadeInAnimation)
        }

        ac_main_btn_fadeOut.setOnClickListener {
            ac_main_imageView.startAnimation(fadeOutAnimation)
        }

        ac_main_btn_scale.setOnClickListener {
            ac_main_imageView.startAnimation(scaleAnimation)
        }

        ac_main_btn_rotate.setOnClickListener {
            ac_main_imageView.startAnimation(rotateAnimation)
        }

        ac_main_btn_scale_rotate.setOnClickListener {
            ac_main_imageView.startAnimation(scaleRotateAnimation)
        }

        ac_main_btn_translate.setOnClickListener{
            ac_main_imageView.startAnimation(translateAnimation)
        }
    }
}
