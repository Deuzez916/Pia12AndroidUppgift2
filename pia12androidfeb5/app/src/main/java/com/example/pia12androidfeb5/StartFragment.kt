package com.example.pia12androidfeb5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StartFragment : Fragment() {

    var shopadan = ShoppingAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        shopadan.startfrag = this

        val shoprecview = view.findViewById<RecyclerView>(R.id.ShoppingRV)

        shoprecview.layoutManager = LinearLayoutManager(requireContext())

        val shopadap = ShoppingAdapter()

        shoprecview.adapter = shopadap

        view.findViewById<Button>(R.id.addbutton).setOnClickListener {

            var addnametext = view.findViewById<EditText>(R.id.addNameEdittext)
            var addamounttext = view.findViewById<EditText>(R.id.addAmountEdittext)

            val whatbuy = addnametext.text.toString()
            val amountbuy = addamounttext.text.toString()

            addnametext.setText("")
            addamounttext.setText("")

            var amount = amountbuy.toIntOrNull()

            if (amount == null) {
                // Error
                return@setOnClickListener
            }

            /*
            SWIFT
            if let siffra = amount {
                siffra // int
            }
            */

            /*
            amount.let {

            }
            */

            var tempshop = shopitem()
            tempshop.shopname = whatbuy
            tempshop.shopamount = amount

            shopadap.shoppingList.add(tempshop)
            shopadap.notifyDataSetChanged()
        }
    }

    fun godetail(shopthing : shopitem) {

        var detailfrag = ShopdetailFragment()
        detailfrag.currentshop = shopthing

        requireActivity().supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView, detailfrag).addToBackStack(null).commit()
    }

    fun loadshop() {

    }
}