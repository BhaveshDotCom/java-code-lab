# Points to Remember

Static methods cannot be overridden because they belong to the class, not the object, so polymorphism does not apply.

Final methods cannot be overridden because Java prevents changing their implementation in child classes.

Private methods cannot be overridden because they are accessible only within their own class.

Final classes cannot be inherited, so overriding and polymorphism are not possible.

Variables do not support overriding because they are resolved using reference type at compile time, not object type at runtime.
