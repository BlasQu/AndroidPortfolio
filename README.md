**All Android Projects**

**1. Pokemons**

Application that uses Retrofit service as an REST Api with @GET requests to join JSON data to app and then convert it to model of entity and put the data into the SQL Database with ROOM. Data validity was set on 10 minutes. After that period the timer sets to 0 and an Api sends get request at the last checkpoint where the user's data got expired. Pagination was set at 50 items per page.

**What tools I used:**
- MVVM Architecture,
- ROOM,
- Dagger Hilt,
- KotlinFlow, StateFlow, SharedFlow
- Datastore,
- Retrofit
- Fresco

**Screnshots:**

![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Pokemons%20-%20Screens/1.png)
![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Pokemons%20-%20Screens/2.png)
![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Pokemons%20-%20Screens/3.png)


**2. ScanToPDF!**

This project is by far my most satisfying implementation of new methods I had to learn, starting with that I was totally unaware of how to implement 80% of functions occuring in application, however with time I seemed to understand more of its concepts. I completely learned how to support fully working camera with croping, attaching from gallery, accessing all files, requesting advanced permissions and even more details like shapes, animations, transitions and other UI related things.
(Work time: 35 hours)

App basically is designed to take photo/import from gallery of a document and post nor save it to the PDF file so it can easily be sent with other sources.
OpenCV library for camera made by **mayuce**.

![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Android%20App%20Gifs/ScanToPDF-Gif.gif)

**3. SimpleShopping!**

Reworked shopping lists app with new frameworks, useful tools and options. Designed to have much better practical usage without any useless options.

**What tools I used:**
- MVVM Architecture
- ROOM Database
- Koin DI
- KotlinFlow, StateFlow, SharedFlow
- Datastore
- ActionView in RV

**Screnshots:**

![](https://github.com/BlasQu/AndroidPortfolio/blob/main/SimpleShoppingRework%20-%20Screens/1.png)
![](https://github.com/BlasQu/AndroidPortfolio/blob/main/SimpleShoppingRework%20-%20Screens/2.png)
![](https://github.com/BlasQu/AndroidPortfolio/blob/main/SimpleShoppingRework%20-%20Screens/3.png)
![](https://github.com/BlasQu/AndroidPortfolio/blob/main/SimpleShoppingRework%20-%20Screens/4.png)

**4. RemindMe!**

App is designed to store neccesary informations like login/password/pin. It also gives a possibility to provide additional description for different credentials.
First app I ever developed and it's the one I'm the most proud of since it was the most polished one.
(Work time: 21 hours)

**What tools I used:**
- MVVM Architecture
- ROOM Database with search view
- Recycler View with custom adapter
- Advanced Alert Dialogs with custom views
- Shared Prefs and multi-language support


**Video presentation:**

![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Android%20App%20Gifs/RemindMe-Gif.gif)

**5. Shopping Lists**

Simple shopping lists with dagger hilt, Room databases for each shopping list and details, supporting every screen size and more!

**What tools I used:**
- MVVM Architecture
- Dagger Hilt
- Advanced Alert Dialogs with custom views
- Advanced Livedata
- TabLayout with animationUtil


**Video presentation:**

![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Android%20App%20Gifs/ShoppingLists.gif)


**6. MathThat!**

Calculator with material design - includes romanian calculator.
I developed this app mainly because I was curious how livedata can synchronize with StringBuilder and coroutines at realtime changes on UI.
(Work time: 11.5 hours)

**What tools I used:**
- MVVM Architecture
- Fragment Manager with animations
- LiveData and VM coroutines


**Video presentation:**

![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Android%20App%20Gifs/MathThat-Gif.gif)


**7. Breaking News Guardian API!**

Test app to show that I can work with Retrofit 2 GET calls.
(Work time: 13 hours)

**What tools I used:**
- MVVM Architecture
- Retrofit 2
- Recycler View with pagination and DiffUtil
- Permission usage and network conditions


**Video presentation:**

![](https://github.com/BlasQu/AndroidPortfolio/blob/main/Android%20App%20Gifs/GuardianAPI-Gif.gif)
