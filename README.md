# Validation Framework – Mini Spring (experimental)

A lightweight Java validation library that gradually evolves into a **mini IoC container** inspired by Spring fundamentals.

This project is for **learning and experimentation**: understanding annotations, reflection, decoupling, and inversion of control from first principles.

---

##  Features

### v0.1
- Custom validation annotations (`@NotNull`, `@Range`, `Email`)
- Basic validation engine

### v0.2
- `BeanDefinition` acting as manual configuration
- `MiniContainer` implementing IoC principles
- Decoupling via interfaces (programming to abstractions)
- Reflection-based object creation

---

##  Goal

The main goal is **educational**, not production use:
- Understand how frameworks like Spring work internally
- Learn reflection, metadata, and runtime wiring
- Explore clean architecture and Open–Closed Principle