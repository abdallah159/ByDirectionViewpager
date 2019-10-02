# By Direction Viewpager easy RTL support

A ``ViewPager Android library`` written in ``kotlin`` that supports right to left for RTL locales with a ````natively  ViewPager````.


### How to import in Your Android Studio Project
The library is published on ``jCenter`` you need to add the following dependency to your ```build.gradle ``` file.
```
dependencies {
    implementation 'com.code95.rtlviewpager:viewpager:0.0.1'
}
```

![alt tag](https://media.giphy.com/media/ckqrSE722Y9wBhFpAv/giphy.gif)
![alt tag](https://media.giphy.com/media/l1ZRIDLrCk9UedMWvP/giphy.gif)


### How to use (You can check attached ``Sample Project``)
Send `isRtlOriented` = ``true or false`` to the ``RTLPagerAdapter`` as a parameter.

````
var mTabsAdapter = RTLPagerAdapter(supportFragmentManager, mTabs, true)
```` 

#### Libirary is designed and developed by 
## @Code95 Mobile Team.
