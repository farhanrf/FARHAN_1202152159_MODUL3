package com.example.farhan.farhan_1202152159_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter mAdapter;

    public static ArrayList<ItemMinuman> DATA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        DATA = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new Adapter(DATA);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    public ArrayList<ItemMinuman> isi(){
        ArrayList<ItemMinuman> data = new ArrayList<>();
        data.add(new ItemMinuman("Ades", "Air Minum Merk ADES","Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang.",R.drawable.ades));
        data.add(new ItemMinuman("Aqua","Air Minum Mineral Merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new ItemMinuman("Amidis","Air Minum Mineral Merk AMIDIS","Amidis adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.",R.drawable.amidis));
        data.add(new ItemMinuman("Cleo","Air Minum Mineral Merk CLEO","Cleo adalah air minum berbahan dasar yang diambil dari sumber air yang kemudian diproses melalui hyper membrane filter dan ozonisasi. Air murni di proses melalui teknologi hiperfiltrasi 0,0001 mikron.",R.drawable.cleo));
        data.add(new ItemMinuman("Club","Air Minum Mineral Merk CLUB","Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk..",R.drawable.club));
        data.add(new ItemMinuman("Equil","Air Minum Mineral Merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));
        data.add(new ItemMinuman("Evian","Air Minum Mineral Merk EVIAN","Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.",R.drawable.evian));
        data.add(new ItemMinuman("Le Mineralle","Air Minum Mineral Merk LE MINERALLE","Le Mineralle, pure and preserved mineral water sourced from the mountain and packed directly on site using the latest technology (mineral protection system) to bring you a healthy refreshment for optimum body function.",R.drawable.leminerale));
        data.add(new ItemMinuman("Nestle","Air Minum Mineral Merk NESTLE","Nestle mengeluarkan produk air minum nya yang diberi nama air minum nestle pure life.",R.drawable.nestle));
        data.add(new ItemMinuman("Pristine","Air Minum Mineral Merk PRISTINE","Sumber mata air PRISTINE murni dan asli berasal dari Pegunungan Pangrango Gede,30 mil dari Jakarta Selatan ( 1.5 jam dari Jakarta Pusat),berlokasi disamping “ Taman Nasional Pangrango Gede”.\n",R.drawable.pristine));
        data.add(new ItemMinuman("Vit","Air Minum Mineral Merk VIT","VIT adalah sebuah merk air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo.",R.drawable.vit));
        return data;
    }
}
