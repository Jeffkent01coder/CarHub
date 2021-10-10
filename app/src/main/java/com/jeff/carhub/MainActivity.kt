package com.jeff.carhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jeff.carhub.databinding.ActivityMainBinding
import com.jeff.carhub.model.CarData
import com.jeff.carhub.utility.carAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var carAdapter: carAdapter
    private lateinit var carData: ArrayList<CarData>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        carData = ArrayList<CarData>()
        carAdapter = carAdapter(carData)
        binding.carsRecycler.layoutManager = LinearLayoutManager(this)
        binding.carsRecycler.adapter = carAdapter
        listUser()

    }
    fun listUser(){
        carData.add(CarData(R.drawable.a,"1. Lamboghini:","Black and fast"))
        carData.add(CarData(R.drawable.b,"2. Ferrari:","Latest model"))
        carData.add(CarData(R.drawable.bb,"3. Mercedes:","Comfatable"))
        carData.add(CarData(R.drawable.bu,"4. Porshe: ","Classy"))
        carData.add(CarData(R.drawable.bw,"5. Audi:","240 miles per hr"))
        carData.add(CarData(R.drawable.c,"6. Toyota: ","Affordable"))
        carData.add(CarData(R.drawable.f,"7. limoo: ","Efficient"))
        carData.add(CarData(R.drawable.l,"8. Maqueen: ","Rubber tires"))
        carData.add(CarData(R.drawable.m,"9. Lightening:","Automatic"))
        carData.add(CarData(R.drawable.me,"10. Black snake:","Manual"))
        carData.add(CarData(R.drawable.n,"11. Mercedes:","Latest Version"))
        carData.add(CarData(R.drawable.pr,"12. Porshe:","Cayenne wit the most comfy"))
        carData.add(CarData(R.drawable.y,"13. Crown:","Latest model of toyota"))
        carData.add(CarData(R.drawable.bbw,"14. Benz: ","Black with New Reams"))
        carData.add(CarData(R.drawable.mg,"15. VolksWagen:","Manual and dark grey"))
        carData.add(CarData(R.drawable.br,"16. Masserati: ","Deamon Speed"))
        carData.add(CarData(R.drawable.a,"17. RolceRoyce: ","astonishing"))

    }

}