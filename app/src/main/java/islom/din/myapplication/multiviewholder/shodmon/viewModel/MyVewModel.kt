package islom.din.myapplication.multiviewholder.shodmon.viewModel

import islom.din.myapplication.R
import islom.din.myapplication.multiviewholder.shodmon.data.Country

class MyVewModel {

    fun getData(){
        val items : MutableList<Country> = mutableListOf()
        items.add(Country(1,"Tajikistan", R.drawable.hobbit))
        items.add(Country(2,"Canada", R.drawable.game_of_thrones))
    }


}