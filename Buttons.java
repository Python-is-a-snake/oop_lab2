package com.company;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;

//this class uses "Factory" pattern

interface Button {
    void render();
    void onClick();
}

