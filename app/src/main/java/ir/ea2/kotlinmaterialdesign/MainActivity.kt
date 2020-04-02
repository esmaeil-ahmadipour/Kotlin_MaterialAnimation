package ir.ea2.kotlinmaterialdesign

import android.animation.ValueAnimator
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG: String = "LOG_TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valueAnimatorSampleCode()


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

        ac_main_btn_translate.setOnClickListener {
            ac_main_imageView.startAnimation(translateAnimation)
        }
    }

    private fun valueAnimatorSampleCode() {
        val animator = ValueAnimator.ofFloat(1f, 100f)
        animator.duration = 2000
        animator.addUpdateListener {
            Log.i(TAG, it.animatedValue.toString())
        }

        // * One repeat = Two Running
        //animator.repeatCount=1

        // * First Running : Normal & Second Running : Reverse.
        //animator.repeatMode= ValueAnimator.REVERSE

        // * Endless Loop : First Normal & Second Reverse And Running Again .
        //animator.repeatMode= ValueAnimator.INFINITE

        animator.start()
    }
}
