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
