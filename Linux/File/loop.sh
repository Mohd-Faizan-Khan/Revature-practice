#write a script to display number from 1 to 10

#!/bin/bash
echo Enter a number
read num
for((i=1; i<=num; i++))
do
echo $i
done