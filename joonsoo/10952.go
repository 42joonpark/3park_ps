package main

import (
	"bufio"
	"fmt"
	"os"
)

var (
	reader = bufio.NewReader(os.Stdin)
	writer = bufio.NewWriter(os.Stdout)
)

func main() {
	defer writer.Flush()

	var N, M int
	for {
		fmt.Fscan(reader, &N, &M)
		if N == 0 && M == 0 {
			return
		}
		fmt.Fprintln(writer, N+M)
	}
}
