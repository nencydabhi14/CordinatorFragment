# CordinatorFragment

            <?xml version="1.0" encoding="utf-8"?>
            <androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
                xmlns:app="http://schemas.android.com/apk/res-auto"
                xmlns:tools="http://schemas.android.com/tools"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:background="@color/white"
                tools:context=".MainActivity">

                <com.google.android.material.appbar.AppBarLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content">

                    <com.google.android.material.appbar.CollapsingToolbarLayout
                        android:id="@+id/collapsing_toolbar"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        android:fitsSystemWindows="true"
                        app:contentScrim="#007705"
                        app:expandedTitleMarginEnd="64dp"
                        app:expandedTitleMarginStart="48dp"
                        app:layout_scrollFlags="scroll|exitUntilCollapsed|enterAlways">

                        <ImageView
                            android:layout_width="match_parent"
                            android:layout_height="250dp"
                            android:minHeight="100dp"
                            android:scaleType="centerCrop"
                            android:src="@drawable/plant"
                            app:layout_collapseMode="parallax"
                            app:layout_scrollFlags="scroll|enterAlways|enterAlwaysCollapsed" />

                        <androidx.appcompat.widget.Toolbar
                            android:id="@+id/toolbar"
                            android:layout_width="match_parent"
                            android:layout_height="120dp"
                            app:layout_collapseMode="pin"
                            app:navigationIcon="@drawable/ic_baseline_arrow_back_24" />

                        <com.google.android.material.tabs.TabLayout
                            android:id="@+id/tabLayout"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:layout_gravity="bottom"
                            android:background="#7C000000"
                            app:tabIconTintMode="src_over"
                            app:tabIndicatorColor="#009306"
                            app:tabSelectedTextColor="#ffffff"
                            app:tabTextColor="#d3d3d3" />

                    </com.google.android.material.appbar.CollapsingToolbarLayout>
                </com.google.android.material.appbar.AppBarLayout>


                <androidx.core.widget.NestedScrollView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:fillViewport="true"
                    app:layout_behavior="@string/appbar_scrolling_view_behavior">

                    <androidx.viewpager.widget.ViewPager
                        android:id="@+id/viewPager"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content" />
                </androidx.core.widget.NestedScrollView>
            </androidx.coordinatorlayout.widget.CoordinatorLayout>
            
            
            
                                          ---de
            
                                        "plant_image": [
                                        {
                                          "id": "0",
                                          "nombre": "Sodbrennen",
                                          "img": "file:///android_asset/icons/therapeutic/0.png"
                                        },
                                        {
                                          "id": "1",
                                          "nombre": "Akne",
                                          "img": "file:///android_asset/icons/therapeutic/1.png"
                                        },
                                        {
                                          "id": "2",
                                          "nombre": "Altern",
                                          "img": "file:///android_asset/icons/therapeutic/34.png"
                                        },
                                        {
                                          "id": "3",
                                          "nombre": "Allergie",
                                          "img": "file:///android_asset/icons/therapeutic/4.png"
                                        },
                                        {
                                          "id": "4",
                                          "nombre": "Anämie",
                                          "img": "file:///android_asset/icons/therapeutic/5.png"
                                        },
                                        {
                                          "id": "5",
                                          "nombre": "Magersucht",
                                          "img": "file:///android_asset/icons/therapeutic/94.png"
                                        },
                                        {
                                          "id": "6",
                                          "nombre": "Entzündungshemmend",
                                          "img": "file:///android_asset/icons/therapeutic/7.png"
                                        },
                                        {
                                          "id": "7",
                                          "nombre": "Antiseptikum",
                                          "img": "file:///android_asset/icons/therapeutic/8.png"
                                        },
                                        {
                                          "id": "8",
                                          "nombre": "Angst",
                                          "img": "file:///android_asset/icons/therapeutic/6.png"
                                        },
                                        {
                                          "id": "9",
                                          "nombre": "Aphrodisiakum",
                                          "img": "file:///android_asset/icons/therapeutic/3.png"
                                        },
                                        {
                                          "id": "10",
                                          "nombre": "Gelenkentzündung",
                                          "img": "file:///android_asset/icons/therapeutic/9.png"
                                        },
                                        {
                                          "id": "11",
                                          "nombre": "Asthma",
                                          "img": "file:///android_asset/icons/therapeutic/10.png"
                                        },
                                        {
                                          "id": "12",
                                          "nombre": "Mundgeruch",
                                          "img": "file:///android_asset/icons/therapeutic/60.png"
                                        },
                                        {
                                          "id": "13",
                                          "nombre": "Durchblutung",
                                          "img": "file:///android_asset/icons/therapeutic/16.png"
                                        },
                                        {
                                          "id": "14",
                                          "nombre": "Bronchitis",
                                          "img": "file:///android_asset/icons/therapeutic/16.png"
                                        },
                                        {
                                          "id": "15",
                                          "nombre": "Bulimie",
                                          "img": "file:///android_asset/icons/therapeutic/95.png"
                                        },
                                        {
                                          "id": "16",
                                          "nombre": "Verbrennungen",
                                          "img": "file:///android_asset/icons/therapeutic/78.png"
                                        },
                                        {
                                          "id": "17",
                                          "nombre": "Wunden im Mund",
                                          "img": "file:///android_asset/icons/therapeutic/59.png"
                                        },
                                        {
                                          "id": "18",
                                          "nombre": "Herz-Kreislauf-Erkrankungen",
                                          "img": "file:///android_asset/icons/therapeutic/31.png"
                                        },
                                        {
                                          "id": "19",
                                          "nombre": "Cellulite",
                                          "img": "file:///android_asset/icons/therapeutic/14.png"
                                        },
                                        {
                                          "id": "20",
                                          "nombre": "Frostbeulen",
                                          "img": "file:///android_asset/icons/therapeutic/81.png"
                                        },
                                        {
                                          "id": "21",
                                          "nombre": "Cholesterin",
                                          "img": "file:///android_asset/icons/therapeutic/18.png"
                                        },
                                        {
                                          "id": "22",
                                          "nombre": "Narbenbildend",
                                          "img": "file:///android_asset/icons/therapeutic/15.png"
                                        },
                                        {
                                          "id": "23",
                                          "nombre": "Reinige die Leber",
                                          "img": "file:///android_asset/icons/therapeutic/58.png"
                                        },
                                        {
                                          "id": "24",
                                          "nombre": "Erkältung",
                                          "img": "file:///android_asset/icons/therapeutic/79.png"
                                        },
                                        {
                                          "id": "25",
                                          "nombre": "Dickdarmentzündung",
                                          "img": "file:///android_asset/icons/therapeutic/19.png"
                                        },
                                        {
                                          "id": "26",
                                          "nombre": "Verstopfung",
                                          "img": "file:///android_asset/icons/therapeutic/36.png"
                                        },
                                        {
                                          "id": "27",
                                          "nombre": "Husten",
                                          "img": "file:///android_asset/icons/therapeutic/86.png"
                                        },
                                        {
                                          "id": "28",
                                          "nombre": "Blasenentzündung",
                                          "img": "file:///android_asset/icons/therapeutic/17.png"
                                        },
                                        {
                                          "id": "29",
                                          "nombre": "Nieren reinigen",
                                          "img": "file:///android_asset/icons/therapeutic/22.png"
                                        },
                                        {
                                          "id": "30",
                                          "nombre": "Depression",
                                          "img": "file:///android_asset/icons/therapeutic/21.png"
                                        },
                                        {
                                          "id": "31",
                                          "nombre": "Hautentzündung",
                                          "img": "file:///android_asset/icons/therapeutic/23.png"
                                        },
                                        {
                                          "id": "32",
                                          "nombre": "Zuckerkrankheit",
                                          "img": "file:///android_asset/icons/therapeutic/24.png"
                                        },
                                        {
                                          "id": "33",
                                          "nombre": "Durchfall",
                                          "img": "file:///android_asset/icons/therapeutic/25.png"
                                        },
                                        {
                                          "id": "34",
                                          "nombre": "Verdauungsprobleme",
                                          "img": "file:///android_asset/icons/therapeutic/75.png"
                                        },
                                        {
                                          "id": "35",
                                          "nombre": "Schwindel",
                                          "img": "file:///android_asset/icons/therapeutic/62.png"
                                        },
                                        {
                                          "id": "36",
                                          "nombre": "Trockene Haut",
                                          "img": "file:///android_asset/icons/therapeutic/72.png"
                                        },
                                        {
                                          "id": "37",
                                          "nombre": "Giftstoffe entfernen",
                                          "img": "file:///android_asset/icons/therapeutic/30.png"
                                        },
                                        {
                                          "id": "38",
                                          "nombre": "Müdigkeit",
                                          "img": "file:///android_asset/icons/therapeutic/13.png"
                                        },
                                        {
                                          "id": "39",
                                          "nombre": "Fettleber",
                                          "img": "file:///android_asset/icons/therapeutic/48.png"
                                        },
                                        {
                                          "id": "40",
                                          "nombre": "Fruchtbarkeit",
                                          "img": "file:///android_asset/icons/therapeutic/93.png"
                                        },
                                        {
                                          "id": "41",
                                          "nombre": "Fieber",
                                          "img": "file:///android_asset/icons/therapeutic/40.png"
                                        },
                                        {
                                          "id": "42",
                                          "nombre": "Grippe",
                                          "img": "file:///android_asset/icons/therapeutic/45.png"
                                        },
                                        {
                                          "id": "43",
                                          "nombre": "Flüssigkeitsretention",
                                          "img": "file:///android_asset/icons/therapeutic/80.png"
                                        },


















                                        {
                                          "id": "2",
                                          "nombre": "Abnehmen"
                                        },




                                        {
                                          "id": "12",
                                          "nombre": "Gallensteine"
                                        },

                                        {
                                          "id": "20",
                                          "nombre": "Reizdarm"
                                        },




                                        {
                                          "id": "26",
                                          "nombre": "Kopfschmerzen"
                                        },
                                        {
                                          "id": "27",
                                          "nombre": "Bauchschmerzen"
                                        },
                                        {
                                          "id": "28",
                                          "nombre": "Zahnschmerzen"
                                        },
                                        {
                                          "id": "29",
                                          "nombre": "Menstruationsschmerzen"
                                        },

                                        {
                                          "id": "32",
                                          "nombre": "Lebererkrankungen"
                                        },
                                        {
                                          "id": "33",
                                          "nombre": "Rheumatische Erkrankungen"
                                        },

                                        {
                                          "id": "35",
                                          "nombre": "Darmkrämpfe"
                                        },

                                        {
                                          "id": "37",
                                          "nombre": "Stress"
                                        },
                                        {
                                          "id": "38",
                                          "nombre": "Appetitlosigkeit"
                                        },
                                        {
                                          "id": "39",
                                          "nombre": "Rachenentzündung"
                                        },

                                        {
                                          "id": "41",
                                          "nombre": "Blähungen"
                                        },
                                        {
                                          "id": "42",
                                          "nombre": "Magenschleimhautentzündung"
                                        },
                                        {
                                          "id": "43",
                                          "nombre": "Glaukom"
                                        },
                                        {
                                          "id": "44",
                                          "nombre": "Gicht"
                                        },

                                        {
                                          "id": "46",
                                          "nombre": "Helicobacter pylori"
                                        },
                                        {
                                          "id": "47",
                                          "nombre": "Hämorrhoiden"
                                        },

                                        {
                                          "id": "49",
                                          "nombre": "Hyperhidrose"
                                        },
                                        {
                                          "id": "50",
                                          "nombre": "Hypertonie"
                                        },
                                        {
                                          "id": "51",
                                          "nombre": "Hypotonie"
                                        },
                                        {
                                          "id": "52",
                                          "nombre": "Verdauungsstörungen"
                                        },
                                        {
                                          "id": "53",
                                          "nombre": "Mageninfektion"
                                        },
                                        {
                                          "id": "54",
                                          "nombre": "Halsentzündung"
                                        },
                                        {
                                          "id": "55",
                                          "nombre": "Harnwegsinfektion"
                                        },
                                        {
                                          "id": "56",
                                          "nombre": "Schlaflosigkeit"
                                        },
                                        {
                                          "id": "57",
                                          "nombre": "Reizbarkeit"
                                        },



                                        {
                                          "id": "61",
                                          "nombre": "Hautflecken"
                                        },

                                        {
                                          "id": "63",
                                          "nombre": "Wechseljahre"
                                        },
                                        {
                                          "id": "64",
                                          "nombre": "Migräne"
                                        },
                                        {
                                          "id": "65",
                                          "nombre": "Übelkeit"
                                        },
                                        {
                                          "id": "66",
                                          "nombre": "Nervös"
                                        },
                                        {
                                          "id": "67",
                                         "nombre": "Neuralgie"
                                        },
                                        {
                                          "id": "68",
                                          "nombre": "Pankreatitis"
                                        },
                                        {
                                          "id": "69",
                                          "nombre": "Darmparasiten"
                                        },
                                        {
                                          "id": "70",
                                          "nombre": "Insektenstiche"
                                        },
                                        {
                                          "id": "71",
                                          "nombre": "Juckende Haut"
                                        },

                                        {
                                          "id": "73",
                                          "nombre": "Müde beine"
                                        },
                                        {
                                          "id": "74",
                                          "nombre": "Speicherprobleme"
                                        },

                                        {
                                          "id": "76",
                                          "nombre": "Vorsteherdrüse"
                                        },
                                        {
                                          "id": "77",
                                          "nombre": "Schuppenflechte"
                                        },


                                        {
                                          "id": "82",
                                          "nombre": "Eileiterentzündung"
                                        },
                                        {
                                          "id": "83",
                                          "nombre": "Nebenhöhlenentzündung"
                                        },
                                        {
                                          "id": "84",
                                          "nombre": "Tachykardie"
                                        },
                                        {
                                          "id": "85",
                                          "nombre": "Sehnenentzündung"
                                        },

                                        {
                                          "id": "87",
                                          "nombre": "Magengeschwür"
                                        },
                                        {
                                          "id": "88",
                                          "nombre": "Harnröhrenentzündung"
                                        },
                                        {
                                          "id": "89",
                                          "nombre": "Krampfadern"
                                        },
                                        {
                                          "id": "90",
                                          "nombre": "Warzen"
                                        },
                                        {
                                          "id": "91",
                                          "nombre": "Erbrechen"
                                        },
                                        {
                                          "id": "92",
                                          "nombre": "Haar"
                                        }



                                      ],

            
            
                        --------------------------------------------------------------es
                      "plant_image": [
                            {
                              "id": "0",
                              "nombre": "Acidez",
                              "img": "file:///android_asset/icons/therapeutic/0.png"
                            },
                            {
                              "id": "1",
                              "nombre": "Acné",
                              "img": "file:///android_asset/icons/therapeutic/1.png"
                            },
                            {
                              "id": "2",
                              "nombre": "Envejecimiento",
                              "img": "file:///android_asset/icons/therapeutic/34.png"
                            },
                            {
                              "id": "3",
                              "nombre": "Alergia",
                              "img": "file:///android_asset/icons/therapeutic/4.png"
                            },
                            {
                              "id": "4",
                              "nombre": "Anemia",
                              "img": "file:///android_asset/icons/therapeutic/5.png"
                            },
                            {
                              "id": "5",
                              "nombre": "Anorexia",
                              "img": "file:///android_asset/icons/therapeutic/94.png"
                            },
                            {
                              "id": "6",
                              "nombre": "Antiinflamatorio",
                              "img": "file:///android_asset/icons/therapeutic/7.png"
                            },
                            {
                              "id": "7",
                              "nombre": "Antiséptico",
                              "img": "file:///android_asset/icons/therapeutic/8.png"
                            },
                            {
                              "id": "8",
                              "nombre": "Ansiedad",
                              "img": "file:///android_asset/icons/therapeutic/6.png"
                            },
                            {
                              "id": "9",
                              "nombre": "Afrodisíaco",
                              "img": "file:///android_asset/icons/therapeutic/3.png"
                            },
                            {
                              "id": "10",
                              "nombre": "Artritis",
                              "img": "file:///android_asset/icons/therapeutic/9.png"
                            },
                            {
                              "id": "11",
                              "nombre": "Asma",
                              "img": "file:///android_asset/icons/therapeutic/10.png"
                            },
                            {
                              "id": "12",
                              "nombre": "Mal aliento",
                              "img": "file:///android_asset/icons/therapeutic/60.png"
                            },
                            {
                              "id": "13",
                              "nombre": "Circulación sanguínea",
                              "img": "file:///android_asset/icons/therapeutic/16.png"
                            },
                            {
                              "id": "14",
                              "nombre": "Bronquitis",
                              "img": "file:///android_asset/icons/therapeutic/11.png"
                            },
                            {
                              "id": "15",
                              "nombre": "Bulimia",
                              "img": "file:///android_asset/icons/therapeutic/95.png"
                            },
                            {
                              "id": "16",
                              "nombre": "Quemaduras",
                              "img": "file:///android_asset/icons/therapeutic/78.png"
                            },
                            {
                              "id": "17",
                              "nombre": "Llagas bucales",
                              "img": "file:///android_asset/icons/therapeutic/59.png"
                            },
                            {
                              "id": "18",
                              "nombre": "Enfermedades cardiovasculares",
                              "img": "file:///android_asset/icons/therapeutic/31.png"
                            },
                            {
                              "id": "19",
                              "nombre": "Celulitis",
                              "img": "file:///android_asset/icons/therapeutic/14.png"
                            },
                            {
                              "id": "20",
                              "nombre": "Sabañones",
                              "img": "file:///android_asset/icons/therapeutic/81.png"
                            },
                            {
                              "id": "21",
                              "nombre": "Colesterol",
                              "img": "file:///android_asset/icons/therapeutic/18.png"
                            },
                            {
                              "id": "22",
                              "nombre": "Cicatrización",
                              "img": "file:///android_asset/icons/therapeutic/15.png"
                            },
                            {
                              "id": "23",
                              "nombre": "Limpiar el hígado",
                              "img": "file:///android_asset/icons/therapeutic/58.png"
                            },
                            {
                              "id": "24",
                              "nombre": "Gripe",
                              "img": "file:///android_asset/icons/therapeutic/45.png"
                            },
                            {
                              "id": "25",
                              "nombre": "Colitis",
                              "img": "file:///android_asset/icons/therapeutic/19.png"
                            },
                            {
                              "id": "26",
                              "nombre": "Estreñimiento",
                              "img": "file:///android_asset/icons/therapeutic/36.png"
                            },
                            {
                              "id": "27",
                              "nombre": "Tos",
                              "img": "file:///android_asset/icons/therapeutic/86.png"
                            },
                            {
                              "id": "28",
                              "nombre": "Cistitis",
                              "img": "file:///android_asset/icons/therapeutic/17.png"
                            },
                            {
                              "id": "29",
                              "nombre": "Depurar riñones",
                              "img": "file:///android_asset/icons/therapeutic/22.png"
                            },
                            {
                              "id": "30",
                              "nombre": "Depresión",
                              "img": "file:///android_asset/icons/therapeutic/21.png"
                            },
                            {
                              "id": "31",
                              "nombre": "Dermatitis",
                              "img": "file:///android_asset/icons/therapeutic/23.png"
                            },
                            {
                              "id": "32",
                              "nombre": "Diabetes",
                              "img": "file:///android_asset/icons/therapeutic/24.png"
                            },
                            {
                              "id": "33",
                              "nombre": "Diarrea",
                              "img": "file:///android_asset/icons/therapeutic/25.png"
                            },
                            {
                              "id": "34",
                              "nombre": "Problemas digestivos",
                              "img": "file:///android_asset/icons/therapeutic/75.png"
                            },
                            {
                              "id": "35",
                              "nombre": "Mareos",
                              "img": "file:///android_asset/icons/therapeutic/62.png"
                            },
                            {
                              "id": "36",
                              "nombre": "Piel seca",
                              "img": "file:///android_asset/icons/therapeutic/72.png"
                            },
                            {
                              "id": "37",
                              "nombre": "Eliminación de toxinas",
                              "img": "file:///android_asset/icons/therapeutic/30.png"
                            },
                            {
                              "id": "38",
                              "nombre": "Cansancio",
                              "img": "file:///android_asset/icons/therapeutic/13.png"
                            },
                            {
                              "id": "39",
                              "nombre": "Hígado graso",
                              "img": "file:///android_asset/icons/therapeutic/48.png"
                            },
                            {
                              "id": "40",
                              "nombre": "Fertilidad",
                              "img": "file:///android_asset/icons/therapeutic/93.png"
                            },
                            {
                              "id": "41",
                              "nombre": "Fiebre",
                              "img": "file:///android_asset/icons/therapeutic/40.png"
                            },
                            {
                              "id": "42",
                              "nombre": "Resfriado",
                              "img": "file:///android_asset/icons/therapeutic/79.png"
                            },
                            {
                              "id": "43",
                              "nombre": "Retención de líquidos",
                              "img": "file:///android_asset/icons/therapeutic/80.png"
                            },
                            {
                              "id": "44",
                              "nombre": "Cálculos biliares",
                              "img": "file:///android_asset/icons/therapeutic/12.png"
                            },
                            {
                              "id": "45",
                              "nombre": "Gases",
                              "img": "file:///android_asset/icons/therapeutic/41.png"
                            },
                            {
                              "id": "46",
                              "nombre": "Gastritis",
                              "img": "file:///android_asset/icons/therapeutic/42.png"
                            },
                            {
                              "id": "47",
                              "nombre": "Glaucoma",
                              "img": "file:///android_asset/icons/therapeutic/43.png"
                            },
                            {
                              "id": "48",
                              "nombre": "Gota",
                              "img": "file:///android_asset/icons/therapeutic/44.png"
                            },
                            {
                              "id": "49",
                              "nombre": "Cabello",
                              "img": "file:///android_asset/icons/therapeutic/92.png"
                            },
                            {
                              "id": "50",
                              "nombre": "Dolor de cabeza",
                              "img": "file:///android_asset/icons/therapeutic/26.png"
                            },
                            {
                              "id": "51",
                              "nombre": "Helicobacter pylori",
                              "img": "file:///android_asset/icons/therapeutic/46.png"
                            },
                            {
                              "id": "52",
                              "nombre": "Hemorroides",
                              "img": "file:///android_asset/icons/therapeutic/47.png"
                            },
                            {
                              "id": "53",
                              "nombre": "Hiperhidrosis",
                              "img": "file:///android_asset/icons/therapeutic/49.png"
                            },
                            {
                              "id": "54",
                              "nombre": "Hipertensión",
                              "img": "file:///android_asset/icons/therapeutic/50.png"
                            },
                            {
                              "id": "55",
                              "nombre": "Hipotensión",
                              "img": "file:///android_asset/icons/therapeutic/51.png"
                            },
                            {
                              "id": "56",
                              "nombre": "Indigestion",
                              "img": "file:///android_asset/icons/therapeutic/52.png"
                            },
                            {
                              "id": "57",
                              "nombre": "Insomnio",
                              "img": "file:///android_asset/icons/therapeutic/56.png"
                            },
                            {
                              "id": "58",
                              "nombre": "Parásitos intestinales",
                              "img": "file:///android_asset/icons/therapeutic/69.png"
                            },
                            {
                              "id": "59",
                              "nombre": "Espasmos intestinales",
                              "img": "file:///android_asset/icons/therapeutic/35.png"
                            },
                            {
                              "id": "60",
                              "nombre": "Irritabilidad",
                              "img": "file:///android_asset/icons/therapeutic/57.png"
                            },
                            {
                              "id": "61",
                              "nombre": "Colon irritable",
                              "img": "file:///android_asset/icons/therapeutic/20.png"
                            },
                            {
                              "id": "62",
                              "nombre": "Falta de apetito",
                              "img": "file:///android_asset/icons/therapeutic/38.png"
                            },
                            {
                              "id": "63",
                              "nombre": "Enfermedades hepáticas",
                              "img": "file:///android_asset/icons/therapeutic/32.png"
                            },
                            {
                              "id": "64",
                              "nombre": "Problemas de memoria",
                              "img": "file:///android_asset/icons/therapeutic/74.png"
                            },
                            {
                              "id": "65",
                              "nombre": "Menopausia",
                              "img": "file:///android_asset/icons/therapeutic/63.png"
                            },
                            {
                              "id": "66",
                              "nombre": "Dolor menstrual",
                              "img": "file:///android_asset/icons/therapeutic/29.png"
                            },
                            {
                              "id": "67",
                              "nombre": "Migraña",
                              "img": "file:///android_asset/icons/therapeutic/64.png"
                            },
                            {
                              "id": "68",
                              "nombre": "Náuseas",
                              "img": "file:///android_asset/icons/therapeutic/65.png"
                            },
                            {
                              "id": "69",
                              "nombre": "Nervios",
                              "img": "file:///android_asset/icons/therapeutic/66.png"
                            },
                            {
                              "id": "70",
                              "nombre": "Neuralgia",
                              "img": "file:///android_asset/icons/therapeutic/67.png"
                            },
                            {
                              "id": "71",
                              "nombre": "Pancreatitis",
                              "img": "file:///android_asset/icons/therapeutic/68.png"
                            },
                            {
                              "id": "72",
                              "nombre": "Faringitis",
                              "img": "file:///android_asset/icons/therapeutic/39.png"
                            },
                            {
                              "id": "73",
                              "nombre": "Próstata",
                              "img": "file:///android_asset/icons/therapeutic/76.png"
                            },
                            {
                              "id": "74",
                              "nombre": "Psoriasis",
                              "img": "file:///android_asset/icons/therapeutic/77.png"
                            },
                            {
                              "id": "75",
                              "nombre": "Enfermedades reumáticas",
                              "img": "file:///android_asset/icons/therapeutic/33.png"
                            },
                            {
                              "id": "76",
                              "nombre": "Salpingitis",
                              "img": "file:///android_asset/icons/therapeutic/82.png"
                            },
                            {
                              "id": "77",
                              "nombre": "Sinusitis",
                              "img": "file:///android_asset/icons/therapeutic/83.png"
                            },
                            {
                              "id": "78",
                              "nombre": "Picazón en la piel",
                              "img": "file:///android_asset/icons/therapeutic/71.png"
                            },
                            {
                              "id": "79",
                              "nombre": "Adelgazar",
                              "img": "file:///android_asset/icons/therapeutic/2.png"
                            },
                            {
                              "id": "80",
                              "nombre": "Manchas en la piel",
                              "img": "file:///android_asset/icons/therapeutic/61.png"
                            },
                            {
                              "id": "81",
                              "nombre": "Picaduras",
                              "img": "file:///android_asset/icons/therapeutic/70.png"
                            },
                            {
                              "id": "82",
                              "nombre": "Dolor de estómago",
                              "img": "file:///android_asset/icons/therapeutic/27.png"
                            },
                            {
                              "id": "83",
                              "nombre": "Infección estomacal",
                              "img": "file:///android_asset/icons/therapeutic/53.png"
                            },
                            {
                              "id": "84",
                              "nombre": "Úlcera de estómago",
                              "img": "file:///android_asset/icons/therapeutic/87.png"
                            },
                            {
                              "id": "85",
                              "nombre": "Estrés",
                              "img": "file:///android_asset/icons/therapeutic/37.png"
                            },
                            {
                              "id": "86",
                              "nombre": "Taquicardia",
                              "img": "file:///android_asset/icons/therapeutic/84.png"
                            },
                            {
                              "id": "87",
                              "nombre": "Tendinitis",
                              "img": "file:///android_asset/icons/therapeutic/85.png"
                            },
                            {
                              "id": "88",
                              "nombre": "Infección de garganta",
                              "img": "file:///android_asset/icons/therapeutic/54.png"
                            },
                            {
                              "id": "89",
                              "nombre": "Piernas cansadas",
                              "img": "file:///android_asset/icons/therapeutic/73.png"
                            },
                            {
                              "id": "90",
                              "nombre": "Dolor de muelas",
                              "img": "file:///android_asset/icons/therapeutic/28.png"
                            },
                            {
                              "id": "91",
                              "nombre": "Uretritis",
                              "img": "file:///android_asset/icons/therapeutic/88.png"
                            },
                            {
                              "id": "92",
                              "nombre": "Infección urinaria",
                              "img": "file:///android_asset/icons/therapeutic/88.png"
                            },
                            {
                              "id": "93",
                              "nombre": "Varices",
                              "img": "file:///android_asset/icons/therapeutic/89.png"
                            },
                            {
                              "id": "94",
                              "nombre": "Vómitos",
                              "img": "file:///android_asset/icons/therapeutic/91.png"
                            },
                            {
                              "id": "95",
                              "nombre": "Verrugas",
                              "img": "file:///android_asset/icons/therapeutic/90.png"
                            }
                          ]

            
            
            
            
