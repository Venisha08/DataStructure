def filter_positive_numbers(nums):
    positive_nums = [num for num in nums if num > 0]
    return positive_nums

nums = [34, 1, 0, -23]

print("Original numbers in the list:", nums)

positive_nums = filter_positive_numbers(nums)
print("Positive numbers in the list:", positive_nums)