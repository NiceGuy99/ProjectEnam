package com.example.projectenam

fun BuatMakanan() : List<PhoneData>{
    val parListMakanan = ArrayList<PhoneData>()
    parListMakanan.add(
        PhoneData(
            "Rujak Cingur",
            "Makanan khas Surabaya yang pertama adalah rujak cingur. \n " +
                    "Bagi Anda yang mengaku pencinta rujak, wajib mencoba olahan rujak yang satu ini. \n " +
                    " Rujak cingur terdiri dari dua jenis, yaitu rujak cingur matengan yang \n " +
                    "semua bahannya dimasak dan rujak cingur campur buah.",
            R.drawable.rujakcingur,
            "Gunung Anyar, Surabaya City, East Java 60294",
            "Rp.10.000/porsi"
        )
    )
    parListMakanan.add(
        PhoneData(
            "Sate Klopo",
            "Sate klopo terbuat dari daging sapi yang diiris tipis dan diberikan \n " +
                    "lumuran kelapa sebelum dibakar. Hal ini yang menjadi pembeda sate klopo \n " +
                    "dengan sate-sate lainnya. Jika sate pada umumnya dibakar menggunakan kecap, \n " +
                    "sate klopo dibalur dulu dengan parutan kelapa sebelum dibakar. \n " +
                    "Rasa yang ditawarkan oleh sate klopo adalah gurih ala kelapa yang menyatu dengan daging bakar,\n " +
                    " sehingga sensasi yang ditimbulkan juga tentu tidak biasa.",
            R.drawable.sateklopo,
            "Jl. Walikota Mustajab No.36, Ketabang, Kec. Genteng, Kota SBY, Jawa Timur 60272",
            "Rp.20.000/porsi"
        )
    )
    parListMakanan.add(
        PhoneData(
            "Lontong Balap",
            "Lontong balap adalah makanan khas Surabaya ketiga yang direkomendasikan \n " +
                    "bagi para pencinta kuliner yang akan berkunjung ke Kota Pahlawan ini. \n " +
                    "Lontong balap terbuat dari campuran lontong, taoge, tahu, daging sapi, dan lento.",
            R.drawable.lontongbalap,
            "Jl. Mayjen Prof. Dr. Moestopo No.11, Pacar Keling, Kec. Tambaksari, Kota SBY, Jawa Timur 60131",
            "Rp.15.000/Porsi"
        )
    )
    parListMakanan.add(
        PhoneData(
            "Tahu Tek",
            "Makanan khas Surabaya selanjutnya adalah tahu telor atau tahu tek. \n " +
                    " Makanan khas Surabaya satu ini berisi potongan tahu yang dicampur dengan telur, \n " +
                    " lalu digoreng bersamaan dan dipotong-potong.",
            R.drawable.tahutek,
            "Jl. Dinoyo No.147, Keputran, Kec. Tegalsari, Kota SBY, Jawa Timur 60265",
            "Rp.12.000/Porsi"
        )
    )
    parListMakanan.add(
        PhoneData(
            "Kepiting Cak Gundul 1992",
            "Kepiting Cak Gundul terkenal dengan kelezatan kepitingnya yang  \n " +
                    "berukuran besar, segar, dan harganya yang terjangkau. Selain kepiting, \n " +
                    "di restoran ini juga menyediakan hidangan seafood lain \n " +
                    "seperti ikan-ikanan, udang, cumi-cumi, dan juga ayam.",
            R.drawable.kepiting,
            "Jl. Raya Kupang Indah No.45, Sonokwijenan, Kec. Sukomanunggal, Kota SBY, Jawa Timur 60225",
            "Rp.30.000/Porsi"
        )
    )
    parListMakanan.add(
        PhoneData(
            "Profil Singkat",
            "Nama : Muhammad Yusuf Ardianyah \n " +
                    "TTL : Sidoarjo, 28 Juli 2000 \n " +
                    "Alamat : Balongebendo Rt. 07 Rw. 01, Kab. Sidoarjo ",
            R.drawable.img_4014,
            "Link github : github.com/NiceGuy99",
            "----------"
        )
    )
    return parListMakanan
}