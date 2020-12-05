<h1><p align="center">Pedometer Application</p>
<hr/>
<p align="center">
<img src="https://user-images.githubusercontent.com/72120614/101186744-58a86000-3608-11eb-8164-db87c15a6bca.png" width="300" height="600" />

 <h3>According to Wikipedia</h3> ⮯⮯
 
*"A pedometer is a device, usually portable and electronic or electromechanical, that counts each step a person takes by detecting the motion of the person's hands or hips"*

<h1><p align="center">WHAT 🤔</p></h1>

↷ I have build step counter using accelerometer sensor, so basically i want to first give a brief introduction of Pedometer Application.

↷ So, I have build a pedometer application to count(on Shaking the device) the steps using the accelerometer sensor data.

↷ Although I know how to work with diffrent layouts I.e.,RelativeLayout, Linear and constraint but for this application i have used Linearlayout and divided the whole linearlayout into two parts consiting of two diffrent constarint layouts as per my choice. 

↷ I have keep User interface as simple as possible consisting of Custom Circular progressbar which will fill its region as per step increment.To make UI a little bit of interactive i have used few icons and images.Inside progressbar i have constrained the Main textview in which user can view the realtime steps numbers increment with respect to accelaeration of deveice.

↷ The Step counter uses onCharge reporting mode which means it reports the event as soon as there is change in the value.
</br>
<p align="center">
<img src="https://images.pexels.com/photos/4428994/pexels-photo-4428994.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940" width="600" height="450" />

<h1><p align="center">WHY 😏</p></h1>
➣ I Choose to make Pedometer because I find this topic interesting and thrilling and at the same time I was amazed how step counting work in various popular Fitness applications.

🤔 ➦So at the begining I was planning to make the same with the help of Google Fit API but then I did some research and found that it will be inconvenient to make the same in Single screen then basically I end up with this descent Application that can be further scaled into full fledged Application with Calorie and distance tracker on the basis of Steps being taken by the user.
<hr/>
<h1><p align="center">HOW 😮</p></h1>
<h3>🏹Accelerometers sensor.</h3>

*"Accelerometers in mobile phones are used to detect the orientation of the phone and an accelerometer measures linear acceleration of movement"*
<hr/>

➣ It is used to measure the rate of change.To compute the step movement, the algorithm used in the App is very simple. It simply takes the magnitude of the acceleration along the 3 axis. Then it calculates the difference of the acceleration magnitude from the previous values.
<br>
<p align="center">
<img src="https://user-images.githubusercontent.com/72120614/101169057-3f47e980-35f1-11eb-94d9-42f9c5ea7dca.png" width="350" height="480" />
<ul>
 <li >To get the magnitude of the 3-D acceleration data</li>
 <li> Sqrt (x_accelration^2 + y_accelration^2 + z_accelration^2)</li>
</li> Then Get the difference in this magnitude from the previous value</li>
<li> If this value is greater than a particular threshold value then increment the steps count.
Threshold for walking = 6
Threshold for running = 10</li>

<h3>💡 Important Note:-</h3> If we specify 0 or no latency in the SensorManager.registerListener() method, then it works in a continuous mode; otherwise, if we specify any latency, then it groups the events in batches and reports them at the specified latency.
<hr/>
<img src="https://www.aosabook.org/en/500L/pedometer-images/walk-1.png" width="700" height="300" />
<hr/>
➣ If this value is greater than a certain threshold (For walking greater than 6 and for running greater than 10) then it does the counting accordingly.
   So stairs is not considered as separate acceleration along the y-axis which is not considered to avoid unnecessary complicating the application.

➣ So, I have also use sharedpreference to keep the previous steps count in app,whenever user will pause the app due to any reason, onPause() will be called which ensure that whatever the steps user took till that time that will store in application.

➣ Sharedpreference has been used to keep the previous data in app,whenever we will pause the app due to any reason, onPause() will be called which ensure
    that whatever the steps user took till that time same has to store in app.

➣ Further on reopening the app onResume() method is responsible to return the data stored in sharedpreference.
</br>
<h3>⚡ Some more functionalities that can be added to scale this Pedometer module of a Fitness Application</h3>

↱ Step counter apps work as pedometers, and are perfect for any fitness level, whether you're walking to lose weight or just trying to get to 10,000 steps a day. Many of these activity trackers can also track mileage, calories burned, food intake, and more so you can stay on track to meet your goals.
We can accepts this fact that Pedometer is Integral part of Fitness appication.Below is the features that can be further added in this simple app to make it much more functional and beneficial.
<p align="center">
 </br>
⚡ Total Calories Burned
</br>
⚡ Total Distance coverd
</br>
⚡ Toatl Duration/time taken
</br>
⚡ START & STOP buttons can be added to take control explicitly instead of onPause() and onStop().
</br>
<h3>Some Jargons used above that can give pain if we do not understand the Definition⚡</h3>

<h3>Acceleration:-</h3>⭮ Acceleration is the rate of change of the velocity of an object with respect to time. Accelerations are vector quantities (in that they have magnitude    and direction). 
<h3>Magnitude:-</h3>⭮ In mathematics, magnitude or size of a mathematical object is a property which determines whether the object is larger or smaller than other objects of the same kind.
<h3>Threshold:-</h3>⭮ The magnitude or intensity that must be exceeded for a certain reaction, phenomenon, result, or condition to occur or be manifested.
<h3>Latency:-</h3>⭮ Latency is the amount of time it takes for a packet of data to be captured, transmitted, processed through multiple devices, then received at its destination and decoded.
<hr/>
<h1><p align="center">😊😴</p></h1>

