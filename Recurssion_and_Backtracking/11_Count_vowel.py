def count_vowel(string , end_index):
    if end_index == -1:
        return 0 
    if string[end_index] in ["a", "e", "i", "o", "u"]:
        return 1 + count_vowel(string , end_index-1)
    else:
        return count_vowel(string , end_index-1)

string = input().lower()
end_index = len(string)-1
print(count_vowel(string, end_index))




