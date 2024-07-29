#Program for switch statements

#!/bin/bash
echo write a number between 1-7
read dayNum
case $dayNum in
1)
echo 'The day is Monday'
;;
2)
echo 'The day is Tuesday'
;;
3)
echo 'The day is Wednesday'
;;
4)
echo 'The day is Thursday'
;;
5)
echo 'The day is Friday'
;;
6)
echo 'The day is Saturday'
;;
7)
echo 'The day is Sunday'
;;
esac