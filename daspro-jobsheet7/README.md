
# PERCOBAAN 1
1.Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan !
2.Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3.Jelaskan fungsi dan alur kerja dari potongan kode berikut!
4.Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!

JAWABAN =
2. jika variabel tertinggi diinisialisasi 0 maka itu maksutnya batas nilai tertinggi nya itu 0 semisal kita memasukan nilai 85 maka yang di detect oleh program ya 85 bukan 0, lalu ketika ada angka yang lebih tinggi lagi contohnya 90 maka yang tertinggi 90 , lalu terendah diinisialisasi dengan 100 maka batasan nilai terendahnya itu 100 semisal kita mamasukkan angka 40 maka yang di detect oleh program adalah 40 bukan 100 semisal ada angka yang lebih kecil lagi 10 maka yang terendah 10. Apabila yang tertinggi itu 100 maka batasan tertingginya ya 100 program tidak akan benar semisal angka yang dimasukan 80 maka di outputnya tetap muncul 100 begitupun dengan nilai terendah 0 apabila kita memasukan angka 10 maka outputnya akan muncul 0 tetap. jadi kesimpulannya program tidak akan benar
3. fungsi dari program tersebut untuk mendeteksi apakah nilai yang kita masukan termasuk yang tertinggi / terendah
4. done

# PERCOBAAN 2
1.Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
a.nilai < 0 || nilai > 100
b.continue
2.Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?
3.Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?
4.Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!

JAWABAN =
1. a. maksut dari kode tersebut itu untuk membatasi nilai yang kita masukan seperti disitu terdapat nilai kurang dari 0 or nilai lebih dari 100 maka ketika kita menginput nilai kurang dari 0 dan lebih dari 100 maka outputnya akan "Nilai Tidak Valid".
b.jika pengguna memasukan nilai yang tidak valid maka akan menghentikan sementara proses di dalam loop saat itu dan langsung melanjutkan ke mahasiswa selanjutnya kesimpulannya continue adalah melewati sisa perintah di dalam satu iterasi (pengulangan) saat ini, lalu langsung lanjut ke iterasi berikutnya.
2.1++ ditulis di akhir supaya data diproses dulu baru penghitung naik. Kalau ditulis di awal, data pertama dilewati karena penghitung naik duluan
3.Kalau jumlah mahasiswa 19, perulangan berjalan 19 kali
4.done (if(nilai > 80 && nilai <= 100){
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A, " + "Bagus,pertahankan nilainya!");)

# PERCOBAAN 3
1.Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan?
2.Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3.Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4.Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?

JAWABAN = 
1. jalan sekali tapi langsung batal
2. saat ketik batal
3. bikin loop jalan terus sampai break
4. karena dikontrol break , bukan variabel penghitung