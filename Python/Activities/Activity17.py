
import pandas
# Create Dictionary
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Write data to a csv file
dataframe = pandas.DataFrame(data)

dataframe.to_csv("sample.csv",index=False)