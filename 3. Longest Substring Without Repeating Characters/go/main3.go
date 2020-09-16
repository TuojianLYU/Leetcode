package main

import "fmt"

func lengthOfLongestSubstring(s string) int {

	n := len(s)
	var ans int
	m := make(map[byte]int)
	for i, j := 0, 0; j < n; j++ {
		if value, ok := m[s[j]]; ok {
			i = max(value, i)
		}
		ans = max(ans, j-i+1)
		m[s[j]] = j + 1
	}

	return ans
}

func max(a int, b int) int {
	if a > b {
		return a
	}

	return b
}

func main() {
	var ans int
	ans = lengthOfLongestSubstring("abcdcca")
	fmt.Print(ans)
}
