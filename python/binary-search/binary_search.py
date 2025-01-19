def find(search_list, value):
    if len(search_list) == 1 and search_list[0] == value:
        return 0
    search_list.sort()

