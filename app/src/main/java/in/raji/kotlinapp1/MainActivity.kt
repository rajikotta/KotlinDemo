package `in`.raji.kotlinapp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val initialY = textView.translationY;
        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textView.text = progress.toString()
                textView.animate().translationY(initialY + progress * resources.getDimension(R.dimen.animY) * -1).rotation(360f);
                if (!fromUser)
                    textView.animate().translationY(initialY).rotationBy(360f);


            }

        })

        button.setOnClickListener { v ->
            seekBar2.progress = 0

        }
    }

}
