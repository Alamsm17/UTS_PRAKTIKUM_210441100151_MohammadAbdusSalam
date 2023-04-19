package com.example.UTS_PRAKTIKUM_210441100151_MohammadAbdusSalam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: Adapter
    lateinit var listData: ArrayList<DataMahasiswa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        listData.add(DataMahasiswa("Iyon", "210441100001", "20 Tahun", R.drawable.iyon))
        listData.add(DataMahasiswa("Rafli", "210441100002", "20 tahun", R.drawable.rafli))
        listData.add(DataMahasiswa("Rehan", "210441100003", "20 tahun", R.drawable.rehan))
        listData.add(DataMahasiswa("Aldi", "210441100004", "20 tahun", R.drawable.aldi))
        listData.add(DataMahasiswa("Jihad", "210441100005", "20 tahun", R.drawable.jihad))
        listData.add(DataMahasiswa("Rikot", "210441100006", "20 tahun", R.drawable.rikot))
        listData.add(DataMahasiswa("Rofek", "210441100007", "20 tahun", R.drawable.rofek))
        listData.add(DataMahasiswa("Fajar", "210441100008", "20 tahun",
            R.drawable.fajar
        ))
        listData.add(DataMahasiswa("Umam", "210441100009", "20 tahun", R.drawable.umam))
        listData.add(DataMahasiswa("Alam", "210441100151", "20 tahun", R.drawable.alam))
        listData.add(DataMahasiswa("Rosi", "210441100010", "20 tahun", R.drawable.rosi))
        listData.add(DataMahasiswa("Iman", "210441100011", "20 tahun", R.drawable.iman))
        listData.add(DataMahasiswa("Noval", "210441100012", "20 tahun",
            R.drawable.noval
        ))
        listData.add(DataMahasiswa("Messi", "210441100013", "20 tahun", R.drawable.messi))
        listData.add(DataMahasiswa("Kevin", "210441100014", "20 tahun", R.drawable.kdb))
        listData.add(DataMahasiswa("Ozil", "210441100015", "20 tahun", R.drawable.ozil))
        listData.add(DataMahasiswa("Neymar", "210441100016", "20 tahun", R.drawable.neymar))
        listData.add(DataMahasiswa("Odegard", "210441100017", "20 tahun", R.drawable.odegard))
        listData.add(DataMahasiswa("Arnold", "210441100018", "20 tahun", R.drawable.arnold))
        listData.add(DataMahasiswa("Dias", "2140441100019", "20 tahun", R.drawable.dias))
        listData.add(DataMahasiswa("Foden", "210441100020", "20 tahun", R.drawable.foden))
        listData.add(DataMahasiswa("Virgil", "210441100021", "20 tahun", R.drawable.vandijk))
        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list) {
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycle.adapter = recycleAdapter
    }
}