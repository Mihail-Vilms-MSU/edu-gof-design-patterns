package structural.composite;

/**
 * Problem:     Model of objects can be represented as a tree structure with part-whole hierarchy;
 *              We want to treat individual objects and compositions of objects uniformly;
 *
 * Solution:    Use same operations for single instance and for group of them
 *              The Composite Pattern has four participants:
 *              - Component: The Component interface describes operations that are common to both
 *              simple and complex elements of the tree.
 *              - Leaf: Leaf defines behavior for primitive objects in the composition.
 *              It represents leaf objects in the composition.
 *              - Composite: Composite stores child components and implements child related operations in the component interface.
 *              - Client: Client manipulates the objects in the composition through the component interface.
 *
 * Pros:    You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
 *          Open/Closed Principle. You can introduce new element types into the app without breaking the existing code,
 *          which now works with the object tree.
 *
 * Cons:    It might be difficult to provide a common interface for classes whose functionality differs too much.
 *          In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.
 */

// This is "Component"
public interface SalaryRecipient {
    float countNetSalary(float taxCoefficient);
}
