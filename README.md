##添加下拉刷新框架

>如何依赖此项目

Step 1. Add the JitPack repository to your build file

gradle

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.xyfx:GodRefreshLayout:Tag'
	}
