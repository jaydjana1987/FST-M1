# Add function Test
import pytest


def test_add():

    a = 5
    b = 7
    sum = a + b
    assert sum == 12

# Sub function Test
def test_sub():

    a = 30
    b = 20
    diff = a - b
    assert diff == 10

# Multiplication function Test

@pytest.mark.activity
def test_multi():
    a = 2
    b = 10
    multi = a * b
    assert multi == 20

# Division function Test

@pytest.mark.activity
def test_division():
    a = 20
    b = 5
    div = a / b
    assert div == 4