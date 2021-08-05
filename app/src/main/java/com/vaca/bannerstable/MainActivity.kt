package com.vaca.bannerstable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bigkoo.convenientbanner.ConvenientBanner
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator
import com.bigkoo.convenientbanner.listener.OnItemClickListener
import com.bigkoo.convenientbanner.listener.OnPageChangeListener

class MainActivity : AppCompatActivity() {
    companion object{
       public val gg = arrayOf(R.drawable.g1, R.drawable.g2, R.drawable.g3)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val con:ConvenientBanner<Da> = findViewById(R.id.banner)

        val xx=listOf<Da>(Da(0),Da(1),Da(2))

        con.setPages(
            object : CBViewHolderCreator {
                override fun createHolder(itemView: View): LocalImageHolderView {
                    return LocalImageHolderView(itemView)
                }

                override fun getLayoutId(): Int {
                    return R.layout.item_banner
                }
            }, xx
        )
            .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT)
            .startTurning(3000) //                .setOnPageChangeListener()//监听翻页事件
            .setOnPageChangeListener(object :OnPageChangeListener{
                override fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {
                   if(newState==0){
                       Log.e("dsfjkl",con.currentItem.toString())
                   }
                }

                override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {

                }

                override fun onPageSelected(index: Int) {

                }

            })

    }
}