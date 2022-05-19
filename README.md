# Toaster-Library
A simple library to show toasts with user data

1. Add it in your root build.gradle at the end of repositories:

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
For newer versions of gradle add it to settings.gradle file

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

2. Add the dependency:
 
 dependencies {
	        implementation 'com.github.samarammar:Toaster-Library:0.1.1'
	}
 


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Write in your onCreate() function:

 UsersMessage().getMessageData(this)
 
 
