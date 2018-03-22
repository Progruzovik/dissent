const path = require("path");

module.exports = {
    entry: path.resolve(__dirname, "src", "main", "ts", "main.ts"),
    module: {
        rules: [
            {
                test: /\.tsx?$/,
                use: "awesome-typescript-loader"
            }
        ]
    },
    output: {
        filename: "js/app.js",
        path: path.resolve(__dirname, "target", "classes", "static")
    },
    resolve: {
        extensions: [".js", ".jsx", ".ts", ".tsx"]
    }
};
