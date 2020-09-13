package main

import "fmt"

func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		another := target - nums[i]
		if value, ok := m[another]; ok {
			return []int{value, i}
		}
		m[nums[i]] = i
	}
	return nil
}

func main() {
	fmt.Print(twoSum([]int{1, 2, 6}, 7))
}
