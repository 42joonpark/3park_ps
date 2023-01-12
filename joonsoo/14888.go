package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	N                     int
	num                   [101]int
	plus, minus, mul, div int
	max_val, min_val      int
	sum                   int
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)
	defer writer.Flush()

	fmt.Fscan(reader, &N)
	for i := 0; i < N; i++ {
		fmt.Fscan(reader, &num[i])
	}
	fmt.Fscan(reader, &plus)
	fmt.Fscan(reader, &minus)
	fmt.Fscan(reader, &mul)
	fmt.Fscan(reader, &div)

	max_val = -1000000000
	min_val = 1000000000

	do(0, num[0])
	fmt.Fprintln(writer, max_val)
	fmt.Fprintln(writer, min_val)
}

func do(cur int, sum int) {
	if cur < N-1 {
		if plus > 0 {
			plus--
			do(cur+1, sum+num[cur+1])
			plus++
		}
		if minus > 0 {
			minus--
			do(cur+1, sum-num[cur+1])
			minus++
		}
		if mul > 0 {
			mul--
			do(cur+1, sum*num[cur+1])
			mul++
		}
		if div > 0 {
			div--
			do(cur+1, sum/num[cur+1])
			div++
		}
	}
	if cur == N-1 {
		if sum > max_val {
			max_val = sum
		}
		if sum < min_val {
			min_val = sum
		}
	}
}
