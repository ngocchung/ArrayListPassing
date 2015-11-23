# ArrayListPassing
Simple Android Application For Sending ArrayList From One Activity To Another Activity

Sending Activity:
```
		ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person(1, "Person A", 20));
        personArrayList.add(new Person(2, "Person B", 30));
        personArrayList.add(new Person(3, "Person C", 40));

        Intent intent = new Intent(this, PersonsActivity.class);
        intent.putExtra("Person_List", personArrayList);
        startActivity(intent);
```

Receiving Activity:
```
		Bundle bundle = getIntent().getExtras();

        ArrayList<Person> personArrayList = bundle.getParcelableArrayList("Person_List");

        if (personArrayList != null && !personArrayList.isEmpty()) {
            for (Person person : personArrayList) {
                Log.i("PersonsActivity", String.valueOf(person.id) + " | " + person.name + " | " + String.valueOf(person.age));
            }
        }
```
