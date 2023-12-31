## 一、什么是适配器设计模式？

将一个接口转换为另一个接口，以使不兼容的接口能够一起工作。适配器模式允许不同接口之间的协作，而无需修改其原始代码。

## 二、实现的组成元素有哪些

**目标接口（Target Interface）**：这是客户端代码期望的接口，但可能与现有的接口不兼容。适配器的目标是将现有接口适配到目标接口上。

**适配器（Adapter）**：适配器是一个实现了目标接口的类，它包装了一个或多个现有对象，使它们适应目标接口。适配器在其方法中调用现有对象的方法。

**现有对象**：这是需要被适配的类，它拥有不兼容的接口，无法直接与目标接口协作。

## 三、适配器模式的使用场景有哪些？

需要一个已有的类集成到一个新的接口时。或是需要与一些可能存在的不兼容接口的类进行协作时。使用适配器可以不改变原有代码。

## 四、适配器模式使用的优缺点有哪些？

优点：解耦（原有代码几乎无需修改），可复用性高（使现有类适配已存在的类），可扩展性强。

缺点：引入适配器类会增加系统的复杂性。