package com.example.creativecalculatorassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    val breadList= arrayOf("Bun", "Hot Dog", "Sub")
    val ingredientsList= arrayOf("Beef", "Chicken", "Cheese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        modalButton.setOnClickListener{
            Modal.visibility=View.INVISIBLE
            button.visibility=View.VISIBLE
        }

        button.setOnClickListener{
            main.visibility=View.INVISIBLE
            button.visibility=View.VISIBLE
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, breadList)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, ingredientsList)

        var b1 = findViewById(R.id.button) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)


        bread.adapter = adapter
        bread.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if (bread.selectedItemPosition == 0) {
                    breadSelect.setText(" " + bread.selectedItem)
                }
                if (bread.selectedItemPosition == 1) {
                    breadSelect.setText(" " + bread.selectedItem)
                }
                if (bread.selectedItemPosition == 2) {
                    breadSelect.setText(" " + bread.selectedItem)
                }
            }
        }

        meat.adapter = adapter2
        meat.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                if (meat.selectedItemPosition == 0){
                    meatSelect.setText(" " + meat.selectedItem)
                }
                if (meat.selectedItemPosition == 1){
                    meatSelect.setText(" " + meat.selectedItem)
                }
                if (meat.selectedItemPosition == 2){
                    meatSelect.setText(" " + meat.selectedItem)
                }
            }
        }

        b1.setOnClickListener{
            if(bread.selectedItemPosition == 0 && meat.selectedItemPosition == 0)
            {
                result.setText("You made : Beef Patty Burger")
            }
            if(bread.selectedItemPosition == 0 && meat.selectedItemPosition == 1)
            { result.setText("You made : Chicken Burger")}

            if(bread.selectedItemPosition == 1 && meat.selectedItemPosition == 0)
            {
                result.setText("You made : Beef Hot Dog")
            }

            if(bread.selectedItemPosition == 1 && meat.selectedItemPosition == 1)
            {
                result.setText("You made : Chicken Hot Dog")
            }

            if(bread.selectedItemPosition == 0 && meat.selectedItemPosition == 2)
            {
                result.setText("You made : Grilled Cheese Sandwich")
            }

            if(bread.selectedItemPosition == 2 && meat.selectedItemPosition == 0)
            {
                result.setText("You made : Beef Sub")
            }

            if(bread.selectedItemPosition == 2 && meat.selectedItemPosition == 2)
            {
                result.setText("You made : Grilled Cheese Sub")
            }

            if(bread.selectedItemPosition == 1 && meat.selectedItemPosition == 2)
            {
                result.setText("You made : Cheese Hot Dog")
            }

            if(bread.selectedItemPosition == 2 && meat.selectedItemPosition == 1)
            {
                result.setText("You made : Chicken Sub")
            }

        }

    }
}