package com.example.recycleview;

import java.util.ArrayList;

public class DataTugas {
    private static String[] tugasNames = {
            "Tugas Proyek 4",
            "Kumpul Himpunan",
            "Dekorasi Ulang Kosan",
            "Bikin Kerajinan",
            "Kontrol ke Dokter",
            "Mencari Sponsor",
            "Nonton Mariposa",
            "Persiapan Quiz PPL1",
            "Les Musik",
            "Surprise Birthday"
    };

    private static String[] tugasDetails = {
            "Deadline : 2 Maret 2020, Waktu Pengerjaan : 29 Februari 2020, Tempat Pengerjaan : Kosan",
            "Deadline : 3 Maret 2020, Waktu Pengerjaan : 1 Maret 2020, Tempat Pengerjaan : Lorong JTK",
            "Deadline : 4 Maret 2020, Waktu Pengerjaan : 2 Maret 2020, Tempat Pengerjaan : Kosan",
            "Deadline : 5 Maret 2020, Waktu Pengerjaan : 3 Maret 2020, Tempat Pengerjaan : Kosan Teman",
            "Deadline : 14 Maret 2020, Waktu Pengerjaan : 14 Februari 2020, Tempat Pengerjaan : RS Santosa",
            "Deadline : 18 Maret 2020, Waktu Pengerjaan : 15 Maret 2020, Tempat Pengerjaan : Bandung Craft Center",
            "Deadline : 25 Maret 2020, Waktu Pengerjaan : 25 Maret 2020, Tempat Pengerjaan : CGV PVJ",
            "Deadline : 28 Maret 2020, Waktu Pengerjaan : 26 Februari 2020, Tempat Pengerjaan : Kosan",
            "Deadline : 4 April 2020, Waktu Pengerjaan : 4 April 2020, Tempat Pengerjaan : Tempat Les",
            "Deadline : 21 April 2020, Waktu Pengerjaan : 21 April 2020, Tempat Pengerjaan : Lapang Basket",

    };

    private static int[] tugasImages = {
            R.drawable.alien_stitch,
            R.drawable.hey_stitch,
            R.drawable.lilo,
            R.drawable.lilo_feat,
            R.drawable.sad_stitch,
            R.drawable.stitch_alien_form,
            R.drawable.stitch_demon,
            R.drawable.stitch_focus,
            R.drawable.stitch_guitar,
            R.drawable.stitch_teddy
    };

    static ArrayList<Tugas> getListData() {
        ArrayList<Tugas> list = new ArrayList<>();
        for (int position = 0; position < tugasNames.length; position++) {
            Tugas tugas = new Tugas();
            tugas.setName(tugasNames[position]);
            tugas.setDetail(tugasDetails[position]);
            tugas.setPhoto(tugasImages[position]);
            list.add(tugas);
        }
        return list;
    }
}