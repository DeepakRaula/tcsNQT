An automation company is about to launch its beta version of automatic doors for the home. Before using voice assistant or Smartphone control, they build a remote control to operate the doors. Due to technical wirework issues, the automation process isn't operating correctly. Assume, there are an N number of doors in a home. It so happens that if one door is opened/closed using a remote control, all the doors in the following indexes will also change their state. i.e. if the initial state of a door(a[0]) is open(1), on pressing the open button on the remote control, all the doors(a[1],a[2],a[3].....a[N]) change their state. Initially, the state of each whether doors open(1) close (0) is given as array elements. The task here is to find the LEAST number of times the button (On/Off) on the remote control has to be used such that all the doors are opened.
Note: The On/Off button for each door can be pressed multiple times.


Example 1:
Input:
5 -> value of N
(1,0,1,1,1] → a[], Element of a[0]to a[N-1],While
Input each element is separated by new line
Output:
2 → Least count of button press
Explanation:
a=[1,0,1,1,1]
Press button 1: [1,1,0,0,0]
Press button 2: [1,1,1,1,1]
Hence, Least 2 button press required to open the all doors
