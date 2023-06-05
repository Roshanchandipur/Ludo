package com.example.ludoletsplay

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.Button
import android.widget.ImageView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
//import kotlinx.coroutines.delay
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var images: ArrayList<Int>
    lateinit var handler: Handler
    lateinit var img: ImageView
    lateinit var final: ArrayList<Int>
    lateinit var board: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //img = findViewById<ImageView>(R.id.board)
//        handler = Handler(Looper.getMainLooper())
//        //board = findViewById(R.id.board)
//        draw()
//        images = arrayListOf(
//            R.drawable.d1,
//            R.drawable.d2,
//            R.drawable.d3,
//            R.drawable.d4,
//            R.drawable.d5,
//            R.drawable.d6,
//            R.drawable.d7,
//            R.drawable.d1,
//            R.drawable.d2,
//            R.drawable.d3,
//            R.drawable.d4,
//            R.drawable.d5,
//            R.drawable.d6,
//            R.drawable.d7,
//            R.drawable.d1,
//            R.drawable.d2,
//            R.drawable.d3,
//            R.drawable.d4,
//            R.drawable.d5,
//            R.drawable.d6,
//            R.drawable.d7,
//            R.drawable.d1,
//            R.drawable.d2,
//            R.drawable.d3,
//            R.drawable.d4,
//            R.drawable.d5,
//            R.drawable.d6,
//            R.drawable.d7
//        )
//        final = arrayListOf(
//            R.drawable.df1,
//            R.drawable.df2,
//            R.drawable.df3,
//            R.drawable.df4,
//            R.drawable.df5,
//            R.drawable.df6
//        )
//        val button = findViewById<Button>(R.id.roll)
//        button.setOnClickListener{
//            GlobalScope.launch(Dispatchers.Main){
//                rollTheDice()
//            }
//        }
    }
    suspend fun rollTheDice(): Int{
        for(item in images){
            img.setImageResource(item)
            delay(30)
        }
        for(i in 0..images.size-10){
            img.setImageResource(images.get(i))
            delay(100)
        }
        val random =  Random.nextInt(1, 7)
        img.setImageResource(final.get(random-1))
        return random
        return 1
    }

    fun draw(){
        val height = board.height
        val width = board.width

        var d = MyCanvasView(this, 500f, 500f)

    }

    private inner class MyCanvasView(context: Context, x:Float, y:Float) : View(context) {

        private val bitmap: Bitmap = BitmapFactory.decodeResource(resources, R.drawable.five_r)
        private val paint: Paint = Paint()


        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)
           // canvas.drawBitmap(bitmap, x, y, paint)
            val left = 100f
            val top = 200f
            val right = 400f
            val bottom = 500f

            // Define the paint properties for the rectangle
            val paint = Paint()
            paint.color = Color.BLUE
            paint.style = Paint.Style.FILL

            // Draw the rectangle on the canvas
            canvas.drawRect(left, top, right, bottom, paint)
        }
    }

}

