PERTANYAAN DARI JOBSHEET 5 TEORI

# PERCOBAAN 1
1.Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
2.Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?

JAWABAN:
1.karena sudah memakai booelan jadi langsung didperiksa saja apakah itu true / false tanpa ada perbandingan lagi.

2.Jika program dijalankan dan kita mengisikan nilai false, maka kondisi IF tidak terpenuhi sehingga perintah di dalam blok IF tidak dijalankan. Akibatnya, program hanya menampilkan teks awal saja tanpa ada pesan tambahan.

# PERCOBAAN 2
1.Apa fungsi dari sintaks break?
2.Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?

JAWABAN:
1.Fungsi sintaks break adalah untuk menghentikan jalannya suatu proses dalam switch-case atau perulangan, sehingga program langsung keluar dari blok tersebut dan tidak menjalankan perintah selanjutnya.

2.Peran sintaks default pada switch-case adalah sebagai pilihan terakhir yang akan dijalankan jika tidak ada satupun nilai case yang cocok dengan kondisi yang diperiksa.

# PERCOBAAN 3
1.Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?
2.Jelaskan maksud dari potongan kode berikut!
3.Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!

JAWABAN:
1.Kalau jawab "No", artinya belum bebas kompen, jadi ga bisa cetak KRS.

2.program bakal ngecek dua syarat sekaligus, yaitu nilai bimbingan minimal 8 dan nilai bimbinganP2 minimal 4. Kalau dua-duanya terpenuhi, baru bagian dalam if dijalankan. Kalau salah satunya tidak terpenuhi, kode di dalam if dilewatin.

3.Alurnya: cek UKT dulu kalau lunas lanjut cek kompen lanjut ke syarat lain kalau semua selesai baru bisa cetak KRS.