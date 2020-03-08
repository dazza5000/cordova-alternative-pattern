{
  mode: 'production',
  resolve: {
    modules: [
      '/rom/source/fivestars/CordovaAlternativePattern/build/js/packages/CordovaAlternativePattern-BluetoothSerialJs/kotlin-dce',
      'node_modules'
    ]
  },
  plugins: [],
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [
          'kotlin-source-map-loader'
        ],
        enforce: 'pre'
      }
    ]
  },
  entry: {
    main: [
      '/rom/source/fivestars/CordovaAlternativePattern/build/js/packages/CordovaAlternativePattern-BluetoothSerialJs/kotlin-dce/CordovaAlternativePattern-BluetoothSerialJs.js'
    ]
  },
  output: {
    path: '/rom/source/fivestars/CordovaAlternativePattern/BluetoothSerialJs/build/distributions',
    filename: [Function: filename],
    library: 'BluetoothSerialJs',
    libraryTarget: 'umd'
  },
  devtool: 'source-map'
}