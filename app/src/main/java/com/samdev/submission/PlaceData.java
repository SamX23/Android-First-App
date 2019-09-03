package com.samdev.submission;

import java.util.ArrayList;

class PlaceData {
    private static String[] placeNames = {
            "Alun-alun Surya Kencana Bogor",
            "Telaga Biru Cianjur",
            "Taman Nasional Pangrango",
            "Pantai Jayanti",
            "The Bagelen Son",
            "Pokland Cianjur",
            "The Johns Aquatic Resort",
            "Taman Bunga Nusantara",
            "Kebun Raya Cibodas",
            "Situs Megalitikum Gunung Padang",
    };

    private static String[] placeDesk = {
            "Kalian yang tengah berwisata ke Taman Nasional Gunung Gede Pangrango sangat rugi jika tidak menjelajahi lokasi wisata tersebut.\n" +
                    "\n" +
                    "Apalagi sampai tidak berkunjung ke Alun-Alun Surya Kencana. Dilokasi tersebut Kalian bakal menemukan seperti apa yang namanya keabadian.\n" +
                    "\n" +
                    "Alun-alun Surya Kencana merupakan sebuah savana seluas kurang lebih 50 hektar di ketinggian 2.750 mdpl.\n" +
                    "\n" +
                    "Hawanya sejuk, suasananya tenang, dan mereka yang baru pertama ke sini dijamin langsung takjub.\n" +
                    "\n" +
                    "Dan yang menjadikan alun-alun ini spesial adalah begitu banyak bunga abadi, Edelweiss, tumbuh dan berkembang.\n" +
                    "\n" +
                    "Jangan sampai melewatkan untuk berpose semenarik mungkin di tengah padang bunga ini. Untuk sampai ke alun-alun ini, dibutuhkan kerjak keras dan semangat pantang menyerah.\n" +
                    "\n" +
                    "Tapi, ketika sampai di sana rasa lelah kalian akan semuanya terbayar lunas dengan melihat langsung apa itu keindahan.\n" +
                    "\n" +
                    "Lokasi yang berada di Taman Nasional Gunung Gede Pangrango Cibodas, Sukamulya, Cugenang memang banyak sekali dikunjungi para wisatawan.\n" +
                    "\n" +
                    "Tunggu apalagi liburan kalian wajib berkunjung kesini nih.\n" +
                    "\n" +
                    "Source: https://bogor.pojoksatu.id",

            "Obyek Wisata Telaga Biru di Cimacan  Cianjur Jawa Barat adalah salah satu tempat wisata yang berada di desa cimacan, kabupaten cianjur, provinsi jawa barat, negara indonesia . Obyek Wisata Telaga Biru di Cimacan  Cianjur Jawa Barat adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.\n" +
                    "\n" +
                    "Obyek Wisata Telaga Biru di Cimacan  Cianjur Jawa Barat memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota cianjur tidak mengunjungi wisata alam  yang mempunyai keindahan  yang tiada duanya tersebut.\n" +
                    "\n" +
                    "Obyek Wisata Telaga Biru di Cimacan  Cianjur Jawa Barat sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari ibur lainnya.  Keindahan Obyek Wisata Telaga Biru di Cimacan  Cianjur Jawa Barat ini sangatlah baik bagi anda semua yang berada di dekat  atau di kejauhan untuk merapat mengunjungi tempat Obyek Wisata Telaga Biru di Cimacan  Cianjur Jawa Barat di kota cianjur.\n" +
                    "\n" +
                    "Source: https://ihategreenjello.com",

            "Taman Nasional Gunung Gede Pangrango (TNGGP) adalah salah satu taman nasional yang berada di Provinsi Jawa Barat.\n" +
                    "\n" +
                    "Taman Nasional ini ditetapkan pada tahun 1980 dan merupakan salah satu taman nasional tertua di Indonesia. \n" +
                    "\n" +
                    "Pada tahun 2003, wilayahnya diperluas dengan hutan-hutan yang berdekatan yang semula dikelola oleh Perum Perhutani.\n" +
                    "\n" +
                    "Tujuan pendirian Taman Nasional Gunung Gede Pangrango adalah untuk melindungi dan mengkonservasi ekosistem dan flora yang tumbuh di pegunungan cantik yang ada di sekitar Kabupaten Jawa Barat tersebut.\n" +
                    "\n" +
                    "Luasnya mencakup wilayah 21.975 hektare, yang terdiri dari puncak gunung, yaitu Gunung Gede dan Gunung Pangrango beserta tutupan hutan pegunungan di sekelilingnya.\n" +
                    "\n" +
                    "Source: https://alampriangan.com",

            "Pantai Jayanti menjadi salah satu wista pantai andalan di kabupaten Cianjur. Meskipun belum begitu terkenal seperti objek wisata lain di Cianjur namun pantai ini menjanjikan pesona pantai yang indah dan pastinya tidak akan rugi jika mengunjungi pantai ini.\n" +
                    "\n" +
                    "Pantai ini terletak di Jl Pantai Jayanti, Cidamar, Cidaun, Kkabupaten Cianjur Jawa Barat. Aksesnya cukup mudah dan tidak terlalu jauh dari ibu kota Jakarta. Jadi sangat direkomendasikan bagi anda warga Jakarta yang ingin berlibur ke pantai yang eksotis namun tidak memiliki waktu berlibur yang panjang.\n" +
                    "\n" +
                    "Source: https://pantainesia.com",

            "Wisata kolam renang The Bagelen Son Cianjur bisa menjadi pilihan anda untuk mengisi liburan. Selain kolam renang yang banyak, di sana juga terdapat beberapa wahana menarik lainnya. Lokasinya terletak di Kecamatan Karangtengah Kabupaten Cianjur.\n" +
                    "\n" +
                    "“Di antaranya wahana kolam arus, water boom, air mancur dan lain-lain. Fasilitas tempat makan keluarga yang nyaman, tempat parkir luas dan aman,” papar Kemijan, pemilik wisata kolam renang The Bagelen Son.\n" +
                    "\n" +
                    "Ada program untuk menyambut libur panjang. Rombongan yang berkunjung minimal 60 orang akan mendapatkan kaos menarik . Selain itu di sana pun sedang membuat kolam renang baru.\n" +
                    "\n" +
                    "“Kami telah membuka wisata renang tahap dua, yang wahananya sama menarik dengan tahap satu. Diresmikan langsung oleh Letnan Jendral Purn Drs Yoedhi Swastanto MBA, mantan komandan saya,” tuturnya.\n" +
                    "\n" +
                    "Ia menambahkan, selain wisatawan lokal ada juga yang datang dari luar kota. Misalnya dari Bogor, Jakarta, bahkan luar Jawa. Misalnya Bupati Pakpak Irian Jaya yang pernah berkunjung ke Wisata air ini.\n" +
                    "\n" +
                    "“Bagelen Son buka setiap hari mulai jam 08.00 sampai jam 17.00 WIB. Harga tiket masuk dewasa dan anak sama saja, hari biasa Rp20 ribu kalau hari libur atau tanggal merah Rp25 ribu,” terangnya.\n" +
                    "\n" +
                    "Ia berharap para pengunjung The Bagelen Son merasa nyaman dengan segala fasilitas yang telah ada. “Sudah menjadi targetan b   ahwa tiap tahun The Bagelen Son harus membuat wahana baru, sehingga para pengunjung tidak bosan datang,” tandasnya.\n" +
                    "\n" +
                    "Source: https://cianjurtoday.com",

            "Hutan Pinus Pokland berlokasi di Desa Haurwangi, Kecamatan Haurwangi, Kabupaten Cianjur. Lokasi wisata yang diresmikan Bupati Cianjur, Irvan Rivano Muchtar 27 Januari 2017 langsung ngehits setelah dipublikasikan Perum Perhutani KPH Cianjur.\n" +
                    "\n" +
                    "Dikutip dari laman resmi Pemkab Cianjur, lokasi wisata Hutan Pinus Pokland memiliki luas sekitar 30 hektare. Selain pemandangan indah dan instagramable, lokasi wisata Pokland juga menawarkan beberapa fasilitas lain seperti bumi perkemahan, sarana sirkuit motocros, sepeda trail/downhill, pesta kebun, glamping, rumah pohon, tempat bermain anak, museum Tani Macakal, dan fasilitas lainnya.\n" +
                    "\n" +
                    "Selain itu banyak juga spot yang instagramable seperti spot “cinta” yang bisa dijadikan foto kenangan untuk kamu dan pasangan.\n" +
                    "\n" +
                    "Source: http://www.galamedianews.com",

            "Sebuah penginapan yang nyaman untuk berlibur di Cianjur\n" +
                    "\n" +
                    "The Jhons Aquatic Resort sebuah penginapan yang letak strategis di kota Cianjur, menawarkan akses dekat ke tempat hiburan. Penginapan yang modern, nyaman, professional dan dikelola dengan baik dilengkapi dengan fasilitas beragam yang membuat masa menginap anda tidak terlupakan, cocok bagi Anda yang ingin berlibur bersama keluarga atau teman.\n" +
                    "\n" +
                    "Source: http://pegipegi.com",

            "Taman Bunga Nusantara adalah sebuah taman bunga seluas 23 hektare yang terletak dekat Gunung Gede Pangrango dan Kebun Teh Bogor dengan jarak tempuh sekitar 2 jam perjalanan dari Jakarta. Di taman ini disimpan berbagai tipe bunga dan tanaman, dalam hal ini terutama budi daya anggrek. Diperkirakan ada sekitar 2000 jenis anggrek yang dirawat di tempat ini.\n" +
                    "\n" +
                    "Di tempat ini terdapat juga fasilitas hiburan untuk anak-anak berupa minicar, restaurant dan juga permainan ketangkasan.\n" +
                    "\n" +
                    "Taman Bunga Nusantara diresmikan oleh Tien Soeharto pada 10 September 1995.\n" +
                    "\n" +
                    "Source: https://id.wikipedia.org/",

            "Kebun Raya Cibodas adalah obyek wisata untuk keluarga yang ada di Kabupaten Cianjur.  Kebun ini memiliki satu keunikan, yakni memiliki rumput yang seperti Taman Teletubies.\n" +
                    "\n" +
                    "Kebun Raya Cibodas yang juga dikenal dengan nama Cibodas Botanical Garden merupakan taman yang mempunyai luas sekitar 80 hektar dan memiliki topografi berbukit.\n" +
                    "\n" +
                    "Keindahan Kebun di Cibodas ini terkenal di kalangan wisatawan lokal sampai mancanegara. Bahkan, seorang ahli fisiologi tumbuhan yang bernama Dr. Went mengatakan jika Kebun Raya ini adalah jelmaan surga di dunia. Hebat, ya!\n" +
                    "\n" +
                    "Source: https://alampriangan.com/",

            "Situs Gunung Padang merupakan situs prasejarah peninggalan kebudayaan Megalitikum di Jawa Barat. Tepatnya berada di perbatasan Dusun Gunungpadang dan Panggulan, Desa Karyamukti, Kecamatan Campaka, Kabupaten Cianjur.\n" +
                    "Lokasi dapat dicapai 20 kilometer dari persimpangan kota kecamatan Warungkondang, dijalan antara Kota Kabupaten Cianjur dan Sukabumi. Luas kompleks utamanya kurang lebih 900 m², terletak pada ketinggian 885 m dpl, dan areal situs ini sekitar 3 ha, menjadikannya sebagai kompleks punden berundak terbesar di Asia Tenggara.\n" +
                    "\n" +
                    "Source: https://id.wikipedia.org/",
    };

    private static int[] placeImages = {
            R.drawable.pc_1,
            R.drawable.pc_2,
            R.drawable.pc_3,
            R.drawable.pc_4,
            R.drawable.pc_5,
            R.drawable.pc_6,
            R.drawable.pc_7,
            R.drawable.pc_8,
            R.drawable.pc_9,
            R.drawable.pc_10,
    };

    static ArrayList<Place> getListData() {
        ArrayList<Place> list = new ArrayList<>();
        for (int position = 0; position < placeNames.length; position++) {
            Place place = new Place();
            place.setName(placeNames[position]);
            place.setFrom(placeDesk[position]);
            place.setPhoto(placeImages[position]);
            list.add(place);
        }
        return list;
    }
}