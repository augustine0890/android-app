import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { Dimensions, ImageBackground, StyleSheet, Text, View } from 'react-native';

import picSierra from './assets/Sierra-Spencer.png';
import picTanner from './assets/Tanner-McTab.png';

export default function App() {
  return (
    <View style={styles.container}>
      <ImageBackground style={styles.pic} source={picSierra}>
        <Text style={styles.userName}>Sierra Spencer</Text>
      </ImageBackground>
      <ImageBackground style={styles.pic} source={picTanner}>
        <Text style={styles.userName}>Tanner McTab</Text>
      </ImageBackground>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#ddd',
    alignItems: 'center',
    justifyContent: 'space-around',
  },
  defaultText: {
    fontSize: 22,
    padding: 10,
    margin: 5,
    borderWidth: StyleSheet.hairlineWidth,
    color: 'black',
  },
  selectedText: {
    backgroundColor: 'yellow',
    color: 'blue',
    fontWeight: 'bold',
  },
  pic: {
    // borderRadius: 100,
    flex: 1,
    width: Dimensions.get('window').width,
    resizeMode: 'cover',
    justifyContent: 'flex-end',
    alignItems: 'flex-end',
  },
  userName: {
    backgroundColor: 'rgba(0,0,0,.7)',
    fontSize: 25,
    padding: 5,
    color: 'white',
  },
});
