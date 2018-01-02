import * as game from "../../../game";

export default abstract class Projectile extends game.AbstractActor {

    static readonly NEW_SHOT = "newShot";

    constructor(readonly shotsCount: number) {
        super();
    }
}
