def solution(todo_list, finished):
    return [todo_list[i] for i, v in enumerate(finished) if not v]
