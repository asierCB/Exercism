"""Functions for organizing and calculating student exam scores."""


def round_scores(student_scores):
    """Round all provided student scores.

    :param student_scores: list - float or int of student exam scores.
    :return: list - student scores *rounded* to nearest integer value.
    """
    lista = []
    for notas in student_scores:
        lista.append(round(notas))
    return lista


def count_failed_students(student_scores):
    """Count the number of failing students out of the group provided.

    :param student_scores: list - containing int student scores.
    :return: int - count of student scores at or below 40.
    """

    cuenta = 0
    for notas in student_scores:
        if notas <= 40:
            cuenta += 1
            #lista.append(student_scores.index(notas))
    return cuenta


def above_threshold(student_scores, threshold):
    """Determine how many of the provided student scores were 'the best' based on the provided threshold.

    :param student_scores: list - of integer scores.
    :param threshold: int - threshold to cross to be the "best" score.
    :return: list - of integer scores that are at or above the "best" threshold.
    """

    lista = []
    for notas in student_scores:
        if notas >= threshold:
            lista.append(notas)
    return lista


def letter_grades(highest):
    """Create a list of grade thresholds based on the provided highest grade.

    :param highest: int - value of highest exam score.
    :return: list - of lower threshold scores for each D-A letter grade interval.
            For example, where the highest score is 100, and failing is <= 40,
            The result would be [41, 56, 71, 86]:

            41 <= "D" <= 55
            56 <= "C" <= 70
            71 <= "B" <= 85
            86 <= "A" <= 100
    """
    lista = [41]
    intervalo = round((highest - 40) / 4)
    for i in range (1, 4):
        lista.append(41 + i*intervalo)

    return lista
        


def student_ranking(student_scores, student_names):
    """Organize the student's rank, name, and grade information in descending order.

    :param student_scores: list - of scores in descending order.
    :param student_names: list - of string names by exam score in descending order.
    :return: list - of strings in format ["<rank>. <student name>: <score>"].
    """
    lista = []
    for index, (notas, estudiantes) in enumerate(zip(student_scores, student_names)):
        rank = index + 1
        lista.append(f"{rank}. {estudiantes}: {notas}")
    return lista


def perfect_score(student_info):
    """Create a list that contains the name and grade of the first student to make a perfect score on the exam.

    :param student_info: list - of [<student name>, <score>] lists.
    :return: list - first `[<student name>, 100]` or `[]` if no student score of 100 is found.
    """
    lista = []
    for i in range(len(student_info)):
        if student_info[i][1] == 100:
            lista.append(student_info[i][0])
            lista.append(student_info[i][1])
            break
    return lista
