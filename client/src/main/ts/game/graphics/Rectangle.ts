import { Shape } from "./Shape";

export class Rectangle extends Shape {

    constructor(width: number = 0, height: number = 0, color: number = 0x000000) {
        super(width, height, 0, color);
    }

    protected draw() {
        this.beginFill(this.color);
        this.drawRect(0, 0, this.width, this.height);
        this.endFill();
    }
}
