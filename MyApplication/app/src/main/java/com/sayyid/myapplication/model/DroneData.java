package com.sayyid.myapplication.model;

import com.sayyid.myapplication.R;

import java.util.ArrayList;

public class DroneData {

    private static String[] droneNames = {
            "DJI Mavic 2 Pro",
            "DJI Mavic 2 Zoom",
            "DJI Mavic Air",
            "DJI Phantom 4 Pro",
            "DJI Mavic Pro Platinum",
            "DJI Mavic Pro",
            "DJI Spark",
            "DJI Phantom 3 Pro",
            "DJI Phantom 3 Advance",
            "DJI Phantom 3 Standart"
    };

    private static String[] droneDescription ={
            "Hasselblad Camera | 20 MP 1” CMOS Sensor | Adjustable Aperture | 10-bit Dlog-M colour profile | 10-bit HDR Video | Hyperlapse | 8 km 1080p Video Transmission | 31min flight time",
            "2× Optical Zoom Camera | 4× Lossless Zoom FHD Video | 48MP Super Resolution Photo | Dolly Zoom | Hyperlapse | 8 km 1080p Video Transmission | 31min flight time",
            "32 MP Sphere Panoramas | Foldable & Portable | 3-Axis Gimbal | 4K Camera | 3-Directional Environment Sensing | SmartCapture | 21-Minute Flight Time",
            "20MP 1” CMOS Sensor | Forward, Backward & Downward Vision System | Intelligent Flight Battery | 3-Axis Gimbal & 4K | 30-Minutes Flight Time",
            "30-minute Max Flight Time | 4 dB Noise Reduction | 4K Camera | 12 MP Photos | 7 km Range | 65 kph Max Speed",
            "4K Camera | 12 MP Photos | 7 km Range | 65 kph Max Speed",
            "Portable | Obstacle Sensing | PalmLaunch | Gesture Control | Edit & Share",
            "12MP 1/2.3” CMOS | 3-Axis Gimbal & 4K Camera | Downward Vision System | Intelligent Flight Battery | GPS/GLONASS | 30-Minutes Flight Time",
            "12MP 1/2.3” CMOS | 3-Axis Gimbal & 2.7K Camera | Downward Vision System | Intelligent Flight Battery | GPS/GLONASS | 30-Minutes Flight Time",
            "12MP 1/2.3” CMOS | 3-Axis Gimbal & FHD Camera | Downward Vision System | Intelligent Flight Battery | GPS/GLONASS | 30-Minutes Flight Time"
    };

    private static String[] droneDetails = {
            "DJI Mavic 2 Pro adalah drone dari DJI yang dilengkapi dengan Hasselblad Camera. DJI Mavic 2 Pro merupakan seri terbaru dari DJI Mavic Pro yang dilengkapi dengan spesifikasi yang lebih unggul dari pada seri drone pendahulunya. Dengan kamera Hasselblad yang dibuat di Swedia, kamera ini begitu terkenal karena desain ergonomis dan ikonik mereka.\n" +
                    "\n" +
                    "Dibangun dalam kemitraan dengan Hasselblad setelah dua tahun penelitian, DJI Mavic Pro 2 dilengkapi dengan kamera Hasselblad L1D-20c yang terbaru. Kamera L1D-20c memiliki teknologi Hasselblad Natural Color Solution (HNCS) yang unik, membantu pengguna untuk mengambil gambar 20-megapiksel yang cantik dalam detail warna yang menakjubkan.",
            "DJI Mavic 2 Zoom adalah drone dari DJI yang memiliki sensor 12 megapiksel 1/2.3 inci dengan zoom hingga 4x, termasuk zoom optik 2x (24–48 mm), DJI Mavic 2 Zoom adalah semua tentang perspektif yang dinamis. Tangkap semuanya mulai dari wide angle hingga bidikan mid-range bahkan untuk opsi yang lebih kreatif.",
            "DJI Mavic Air begitu ultraportable dengan kinerja dan fungsi penerbangan high-end untuk eksplorasi tak terbatas. Mavic Air dibekali Durasi Terbang 21 Menit dan Kamera 12MP dengan 3-Axis Gimbal & 4K Kamera.\n" +
                    "\n" +
                    "Mavic Air drone generasi terbaru dari DJI, yang hadir dengan ukuran yang lebih compact dan ringkas dari seri sebelumnya. Namun begitu kuat dan bisa dihandalkan dalam mendukung setiap aktivitas aerial fotografi anda. Selain itu, drone ini juga dilengkapi dengan 1/2.3 CMOS sensor dan New ISP (Image Signal Processor), 32 MP Sphere Panorama, 3-Directional Environment Sensing depan, bawah, belakang dengan dukungan Visual Positioning System untuk kontrol lebih baik, hovering dan ketika anda menerbangkannya didalam ruangan.",
            "DJI Phantom 4 Pro merupakan penyempurnaan dari seri terdahulunya phantom 4. Phantom 4 Pro dilengkapi dengan sensor CMOS 1 inchi resolusi 20 megapixel yang mampu mengambil video 4K / 60fps dan Burst mode yang dapat menghasilkan 14 foto per detik. Terbuat dari bahan titanium alloy yang membuatnya begitu kokoh dan menjadikannya lebih ringan.\n" +
                    "\n" +
                    "DJI Phantom 4 Pro menggunakan kamera dengan shutter mekanik yang menghilangkan rolling shutter distorsi yang dapat terjadi saat mengambil gambar dengan subyek yang bergerak cepat atau ketika terbang dengan menggunakan kecepatan yang tinggi.\n" +
                    "\n" +
                    "Menjadikannya, lebih powerful dalam pemrosesan yang mendukung video H.264 4K pada 60fps atau H.265 4K pada 30fps, baik dengan bitrate 100Mbps. Sensor dan prosesor yang canggih memastikan hasil gambar yang diperoleh menjadi lebih detail.",
            "DJI Mavic Pro Platinum memiliki desain yang ramping, body ringkas yang kuat dan menawan. DJI Mavic Pro Platinum merupakan seri terbaru dengan waktu penerbangan yang telah ditingkatkan menjadi 30 menit dan digabungkan dengan 60% pengurangan kebisingan daya yang membuat drone ini menjadi begitu portabel.",
            "Mavic Pro memiliki ukuran yang kecil namun begitu kuat serta mampu mengubah langit menjadi kanvas kreatif Anda dengan mudah, dan membantu Anda untuk mengambil momen dari udara setiap saat.\n" +
                    "\n" +
                    "DJI Mavic Pro memiliki ukuran yang compact/ringkas dengan tingkat kompleksitas tinggi. Selain itu, drone ini juga dilengkapi dengan 24 high-performance computing cores, all new transmission system dengan kemampuan jarak terbang hingga kisaran 4.3 mil (7km), 5 vision sensor, dan Kamera 12MP 4K stabilized dengan sebuah 3-axis mechanical gimbal.",
            "DJI Spark merupakan mini drone terbaru dari DJI yang diperuntukkan sebagai Selfie Drone atau Drone untuk Travelling.\n" +
                    "\n" +
                    "Sesuai dengan fungsi nya, DJI Spark mempunyai dimensi Body yang kecil, ringkas dan mudah di bawa-bawa, serta Sensor Kamera Drone 12MP yang cukup powerful hingga bisa merekam Aerial Video 1080p.\n" +
                    "\n" +
                    "DJI Spark dilengkapi dengan semua teknologi DJI Signature Technologies, termasuk teknologi terbaru yaitu teknologi kontrol Gesture.",
            "DJI Phantom 3 Professional Drone seri Phantom DJI. DJI Phantom 3 Professional di buat sebagai suksesor dari DJI Phantom 2 dengan beberapa kelebihan seperti lebih mudah di terbangkan, jarak jangkau 2km, Kamera 12 Megapixel, video 4K HD, Waktu terbang max. 23 menit, Terintegrasi dengan 3-Axis Stabilization Gimbal, dan Sensor GPS.",
            "DJI Phantom 3 Advanced adalah keluarga drone Phantom 3 dari DJI, dan merupakan “adik” dari DJI Phantom 3 Professional. DJI Phantom 3 Advanced ini memiliki perbedaan resolusi video 2.7K (dibandingkan dengan 4k pada Phantom 3 Professional) dan kecepatan charge 57W (dibandingkan dengan 100W pada Phantom 3 Professional).\n" +
                    "\n" +
                    "Dibuat sebagai suksesor dari DJI Phantom 2, serta “adik” dari Phantom 3 seri Professional, DJI Phantom 3 Advanced ini dilengkapi beberapa kelebihan seperti lebih mudah untuk diterbangkan, jarak jangkau lebih jauh (+- 2km), 12 Megapixel Camera, 2.7K video, dan aplikasi mobile yang intuitif.",
            "DJI Phantom 3 Standard adalah cara terbaik untuk mulai mengenal drone. DJI Phantom 3 Standard harga yang sangat terjangkau dibandingkan dengan variant Phantom lainnya dari DJI, diiringi dengan kemudahan & keamanan yang ditawarkan DJI, drone ini cocok untuk semua orang, bahkan bagi yang yang belum berpengalaman sekalipun."
    };

    private static int[] droneImages = {
            R.drawable.mavic_2_pro,
            R.drawable.mavic_2_zoom,
            R.drawable.mavic_air,
            R.drawable.phantom_4_pro,
            R.drawable.mavic_pro_platinum,
            R.drawable.mavic_pro,
            R.drawable.dji_spark,
            R.drawable.phantom_3_pro,
            R.drawable.phantom_3_adv,
            R.drawable.phantom_3_std
    };

    public static ArrayList<Drone> getListData(){
        ArrayList<Drone> arrDrone = new ArrayList<>();

        for (int possition = 0; possition < droneNames.length ; possition++) {
            Drone drone = new Drone();
            drone.setName(droneNames[possition]);
            drone.setDescription(droneDescription[possition]);
            drone.setDetail(droneDetails[possition]);
            drone.setPhoto(droneImages[possition]);
            arrDrone.add(drone);
        }
        return arrDrone;
    }
}
