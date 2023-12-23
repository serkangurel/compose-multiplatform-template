object Libs {

    object Versions {
        const val glide = "4.15.1"
        const val butterknife = "10.2.3"
        const val hawk = "2.0.1"
        const val adjust = "4.33.3"
        const val inputMask = "6.1.0"
        const val lottie = "6.0.0"
        const val circleIndicator = "2.1.6"
        const val easypermissions = "3.0.0"
        const val stetho = "1.6.0"
        const val rabbitMq = "5.17.0"
        const val facebookSdk = "12.1.0"
        const val overScroll = "1.1.1"
        const val cropper = "3.3.5"
        const val androidYoutubePlayer = "12.0.0"
        const val decompose = "2.0.1"
        const val koin = "3.5.3"
        const val sqlDelight = "1.5.3"
        const val ktor = "2.1.2"
        const val multiplatformPaging = "0.4.7"
        const val voyager = "1.0.0"
        const val stately = "2.0.6"

        object Plugins {
            const val agpVersion = "8.0.2"
            const val googleServices = "4.3.15"
            const val kotlin = "1.9.21"
            const val compose = "1.5.11"
            const val butterknife = "10.2.3"
            const val firebaseCrashlytics = "2.9.5"
            const val huawei = "1.8.1.300"
            const val hilt = "2.45"
            const val dependencyUpdates = "0.50.0"
        }

        object AndroidX {
            const val core = "1.12.0"
            const val activity = "1.4.0"
            const val fragment = "1.5.6"
            const val recyclerView = "1.2.1"
            const val cardView = "1.0.0"
            const val preference = "1.1.1"
            const val appCompat = "1.6.1"
            const val constraintLayout = "2.1.1"
            const val workManager = "2.6.0"
            const val concurrent = "1.1.0"
            const val browser = "1.5.0"
            const val vectorDrawable = "1.1.0"
            const val lifecycleProcess = "2.6.1"
            const val exifInterface = "1.3.3"
            const val cameraVersion = "1.2.2"
            const val cameraViewVersion = "1.2.2"
            const val compose = "1.8.2"
        }

        object Android {
            const val installReferrer = "2.2"
        }

        object Google {
            const val material = "1.8.0"
            const val flexBoxLayout = "3.0.0"
            const val guava = "31.1-android"
        }

        object Test {
            const val jUnit = "4.13.2"
            const val mockito = "5.3.0"
            const val jUnitParams = "1.1.1"
            const val assertjCore = "3.24.2"
        }

        object AndroidTest {
            const val mockito = "5.3.0"
            const val runner = "1.5.2"
            const val espresso = "3.5.1"
            const val jUnit = "1.1.5"
        }

        object Dagger {
            const val dagger = "2.45"
            const val hiltJetpack = "1.0.0"
        }

        object Retrofit {
            const val retrofit = "2.9.0"
            const val okHttp = "4.10.0"
        }

        object PlayServices {
            const val tagManager = "18.0.2"
            const val auth = "20.5.0"
            const val authApiPhone = "18.0.1"
            const val maps = "18.1.0"
            const val location = "21.0.1"
            const val adsIdentifier = "18.0.1"
            const val coreKtx = "1.8.1"
        }

        object Firebase {
            const val config = "21.3.0"
            const val analytics = "21.2.2"
            const val crashlytics = "18.3.6"
            const val messaging = "23.1.2"
            const val instanceId = "21.1.0"
        }

        object Huawei {
            const val core = "1.8.1.300"
            const val location = "6.9.0.300"
            const val maps = "6.10.0.300"
            const val push = "6.9.0.300"
        }

        object Netmera {
            const val core = "3.9.14"
            const val fcm = "3.9.4"
            const val hms = "3.9.5"
        }

        object Image {
            const val imageLoader = "1.2.3"
            const val kamel = "0.7.1"
        }

        object Log {
            const val slf4j = "1.7.30"
            const val logback = "1.2.3"
            const val kermit = "1.0.0"
            const val napier = "2.6.1"
        }

        object Compose {
            const val compose = "1.3.0-beta03"
            const val composeCompiler = "1.3.2"
            const val navCompose = "2.5.2"
            const val composeMaterial3 = "1.0.0-beta03"
            const val coilCompose = "2.4.0"
            const val pagingCompose = "1.0.0-alpha14"
        }
    }

    const val hawk = "com.orhanobut:hawk:${Versions.hawk}"
    const val adjust = "com.adjust.sdk:adjust-android:${Versions.adjust}"
    const val inputmask = "com.github.RedMadRobot:input-mask-android:${Versions.inputMask}"
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
    const val circleIndicator = "me.relex:circleindicator:${Versions.circleIndicator}"
    const val easypermission = "pub.devrel:easypermissions:${Versions.easypermissions}"
    const val rabbitMq = "com.rabbitmq:amqp-client:${Versions.rabbitMq}"
    const val loginFacebook = "com.facebook.android:facebook-login:${Versions.facebookSdk}"
    const val overScroll =
        "io.github.everythingme:overscroll-decor-android:${Versions.overScroll}"
    const val cropper = "com.github.CanHub:Android-Image-Cropper:${Versions.cropper}"
    const val androidYoutubePlayer =
        "com.pierfrancescosoffritti.androidyoutubeplayer:core:${Versions.androidYoutubePlayer}"
    const val stately = "co.touchlab:stately-common:${Versions.stately}"

    object Plugins {
        const val build = "com.android.tools.build:gradle:${Versions.Plugins.agpVersion}"
        const val googleServices =
            "com.google.gms:google-services:${Versions.Plugins.googleServices}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Plugins.kotlin}"
        const val butterknife =
            "com.jakewharton:butterknife-gradle-plugin:${Versions.Plugins.butterknife}"
        const val firebaseCrashlytics =
            "com.google.firebase:firebase-crashlytics-gradle:${Versions.Plugins.firebaseCrashlytics}"
        const val huawei = "com.huawei.agconnect:agcp:${Versions.Plugins.huawei}"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.Plugins.hilt}"
        const val dependencyUpdates =
            "com.github.ben-manes:gradle-versions-plugin:${Versions.Plugins.dependencyUpdates}"
    }

    object AndroidX {
        const val core = "androidx.core:core-ktx:${Versions.AndroidX.core}"
        const val activity = "androidx.activity:activity-ktx:${Versions.AndroidX.activity}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.AndroidX.fragment}"
        const val recyclerView =
            "androidx.recyclerview:recyclerview:${Versions.AndroidX.recyclerView}"
        const val cardView = "androidx.cardview:cardview:${Versions.AndroidX.cardView}"
        const val preference = "androidx.preference:preference-ktx:${Versions.AndroidX.preference}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayout}"
        const val workManager = "androidx.work:work-runtime-ktx:${Versions.AndroidX.workManager}"
        const val concurrent =
            "androidx.concurrent:concurrent-futures-ktx:${Versions.AndroidX.concurrent}"
        const val browser = "androidx.browser:browser:${Versions.AndroidX.browser}"
        const val vectorDrawable =
            "androidx.vectordrawable:vectordrawable-animated:${Versions.AndroidX.vectorDrawable}"
        const val lifecycleProcess =
            "androidx.lifecycle:lifecycle-process:${Versions.AndroidX.lifecycleProcess}"
        const val exifInterface =
            "androidx.exifinterface:exifinterface:${Versions.AndroidX.exifInterface}"
        const val camera = "androidx.camera:camera-camera2:${Versions.AndroidX.cameraVersion}"
        const val cameraView = "androidx.camera:camera-view:${Versions.AndroidX.cameraViewVersion}"
        const val cameraLifecycle =
            "androidx.camera:camera-lifecycle:${Versions.AndroidX.cameraVersion}"
        const val compose =
            "androidx.activity:activity-compose:${Versions.AndroidX.compose}"
    }

    object Android {
        const val installreferrer =
            "com.android.installreferrer:installreferrer:${Versions.Android.installReferrer}"
    }

    object Google {
        const val material = "com.google.android.material:material:${Versions.Google.material}"
        const val flexBoxLayout =
            "com.google.android.flexbox:flexbox:${Versions.Google.flexBoxLayout}"
        const val guava = "com.google.guava:guava:${Versions.Google.guava}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
        const val mockito = "org.mockito:mockito-core:${Versions.Test.mockito}"
        const val junitParams = "pl.pragmatists:JUnitParams:${Versions.Test.jUnitParams}"
        const val assertjCore = "org.assertj:assertj-core:${Versions.Test.assertjCore}"
    }

    object AndroidTest {
        const val mockito = "org.mockito:mockito-android:${Versions.AndroidTest.mockito}"
        const val runner = "androidx.test:runner:${Versions.AndroidTest.runner}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.AndroidTest.espresso}"
        const val jUnit = "androidx.test.ext:junit:${Versions.AndroidTest.jUnit}"
    }

    object Dagger {
        const val hilt = "com.google.dagger:hilt-android:${Versions.Dagger.dagger}"
        const val daggerCompiler = "com.google.dagger:hilt-compiler:${Versions.Dagger.dagger}"
        const val hiltWork = "androidx.hilt:hilt-work:${Versions.Dagger.hiltJetpack}"
        const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.Dagger.hiltJetpack}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit.retrofit}"
        const val gsonConverter =
            "com.squareup.retrofit2:converter-gson:${Versions.Retrofit.retrofit}"
        const val scalarsConverter =
            "com.squareup.retrofit2:converter-scalars:${Versions.Retrofit.retrofit}"
        const val okhttplogger =
            "com.squareup.okhttp3:logging-interceptor:${Versions.Retrofit.okHttp}"
        const val okhttpTls = "com.squareup.okhttp3:okhttp-tls:${Versions.Retrofit.okHttp}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    object Butterknife {
        const val butterknife = "com.jakewharton:butterknife:${Versions.butterknife}"
        const val butterknifeCompiler =
            "com.jakewharton:butterknife-compiler:${Versions.butterknife}"
    }

    object PlayServices {
        const val tagManager =
            "com.google.android.gms:play-services-tagmanager:${Versions.PlayServices.tagManager}"
        const val auth = "com.google.android.gms:play-services-auth:${Versions.PlayServices.auth}"
        const val authApiPhone =
            "com.google.android.gms:play-services-auth-api-phone:${Versions.PlayServices.authApiPhone}"
        const val maps = "com.google.android.gms:play-services-maps:${Versions.PlayServices.maps}"
        const val location =
            "com.google.android.gms:play-services-location:${Versions.PlayServices.location}"
        const val adsIdentifier =
            "com.google.android.gms:play-services-ads-identifier:${Versions.PlayServices.adsIdentifier}"
        const val playCore = "com.google.android.play:core-ktx:${Versions.PlayServices.coreKtx}"
    }

    object Firebase {
        const val config = "com.google.firebase:firebase-config:${Versions.Firebase.config}"
        const val analytics =
            "com.google.firebase:firebase-analytics:${Versions.Firebase.analytics}"
        const val crashlytics =
            "com.google.firebase:firebase-crashlytics:${Versions.Firebase.crashlytics}"
        const val messaging =
            "com.google.firebase:firebase-messaging:${Versions.Firebase.messaging}"
        const val instanceId = "com.google.firebase:firebase-iid:${Versions.Firebase.instanceId}"
    }

    object Huawei {
        const val core = "com.huawei.agconnect:agconnect-core:${Versions.Huawei.core}"
        const val location = "com.huawei.hms:location:${Versions.Huawei.location}"
        const val maps = "com.huawei.hms:maps:${Versions.Huawei.maps}"
        const val push = "com.huawei.hms:push:${Versions.Huawei.push}"
    }

    object Stetho {
        const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
        const val stethoOkhttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
    }

    object Netmera {
        const val core = "com.netmera:nmcore:${Versions.Netmera.core}"
        const val fcm = "com.netmera:nmfcm:${Versions.Netmera.fcm}"
        const val hms = "com.netmera:nmhms:${Versions.Netmera.hms}"
    }

    object Decompose {
        const val decompose = "com.arkivanov.decompose:decompose:${Versions.decompose}"
        const val decomposeExtensions =
            "com.arkivanov.decompose:extensions-compose-jetbrains:${Versions.decompose}-compose-experimental"
    }

    object Koin {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val test = "io.insert-koin:koin-test:${Versions.koin}"
        const val testJUnit4 = "io.insert-koin:koin-test-junit4:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
        const val ktor = "io.insert-koin:koin-ktor:${Versions.koin}"
    }

    object Image {
        const val imageLoader = "io.github.qdsfdhvh:image-loader:${Versions.Image.imageLoader}"
        const val kamel = "media.kamel:kamel-image:${Versions.Image.kamel}"
    }

    object Log {
        const val slf4j = "org.slf4j:slf4j-simple:${Versions.Log.slf4j}"
        const val logback = "ch.qos.logback:logback-classic:${Versions.Log.logback}"
        const val kermit = "co.touchlab:kermit:${Versions.Log.kermit}"
        const val napier = "io.github.aakira:napier:${Versions.Log.napier}"
    }

    object Paging {
        const val multiplatformPaging =
            "io.github.kuuuurt:multiplatform-paging:${Versions.multiplatformPaging}"
    }

    object Ktor {
        const val serverCore = "io.ktor:ktor-server-core:${Versions.ktor}"
        const val serverNetty = "io.ktor:ktor-server-netty:${Versions.ktor}"
        const val serverCors = "io.ktor:ktor-server-cors:${Versions.ktor}"
        const val contentNegotiation = "io.ktor:ktor-client-content-negotiation:${Versions.ktor}"
        const val json = "io.ktor:ktor-serialization-kotlinx-json:${Versions.ktor}"
        const val serverContentNegotiation =
            "io.ktor:ktor-server-content-negotiation:${Versions.ktor}"

        const val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
        const val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
        const val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
        const val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"
        const val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
        const val clientJava = "io.ktor:ktor-client-java:${Versions.ktor}"
        const val clientDarwin = "io.ktor:ktor-client-darwin:${Versions.ktor}"
        const val clientJs = "io.ktor:ktor-client-js:${Versions.ktor}"
        const val clientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
    }

    object SqlDelight {
        const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
        const val coroutineExtensions =
            "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
        const val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
        const val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
        const val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
    }

    object Compose {
        const val compiler =
            "androidx.compose.compiler:compiler:${Versions.Compose.composeCompiler}"
        const val ui = "androidx.compose.ui:ui:${Versions.Compose.compose}"
        const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.Compose.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.Compose.compose}"
        const val foundationLayout =
            "androidx.compose.foundation:foundation-layout:${Versions.Compose.compose}"
        const val material = "androidx.compose.material:material:${Versions.Compose.compose}"
        const val material3 =
            "androidx.compose.material3:material3:${Versions.Compose.composeMaterial3}"
        const val material3WindowSizeClass =
            "androidx.compose.material3:material3-window-size-class:${Versions.Compose.composeMaterial3}"
        const val navigation =
            "androidx.navigation:navigation-compose:${Versions.Compose.navCompose}"
        const val pagingCompose = "androidx.paging:paging-compose:${Versions.Compose.pagingCompose}"
        const val coilCompose = "io.coil-kt:coil-compose:${Versions.Compose.coilCompose}"
    }

    object Voyager {
        // Multiplatform
        const val navigator = "cafe.adriel.voyager:voyager-navigator:${Versions.voyager}"
        const val screenModel = "cafe.adriel.voyager:voyager-screenmodel:${Versions.voyager}"
        const val bottomSheetNavigator =
            "cafe.adriel.voyager:voyager-bottom-sheet-navigator:${Versions.voyager}"
        const val tabNavigator = "cafe.adriel.voyager:voyager-tab-navigator:${Versions.voyager}"
        const val transitions = "cafe.adriel.voyager:voyager-transitions:${Versions.voyager}"
        const val koin = "cafe.adriel.voyager:voyager-koin:${Versions.voyager}"
        const val kodein = "cafe.adriel.voyager:voyager-kodein:${Versions.voyager}"

        // Android
        const val androidx = "cafe.adriel.voyager:voyager-androidx:${Versions.voyager}"
        const val hilt = "cafe.adriel.voyager:voyager-hilt:${Versions.voyager}"
        const val livedata = "cafe.adriel.voyager:voyager-livedata:${Versions.voyager}"
        // Desktop + Android
        const val rxjava = "cafe.adriel.voyager:voyager-rxjava:${Versions.voyager}"
    }

}
