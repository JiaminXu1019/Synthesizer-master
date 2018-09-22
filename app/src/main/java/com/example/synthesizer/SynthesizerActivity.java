package com.example.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynthesizerActivity extends AppCompatActivity implements View.OnClickListener {

    public static final float DEFAULT_VOLUME = 1.0f;
    public static final float DEFAULT_RATE = 1.0f;
    public static final int DEFAULT_PRIORITY = 1;


    private Button buttonA;
    private Button buttonBB;
    private Button buttonB;
    private Button buttonC;
    private Button buttonCsharp;
    private Button buttonD;
    private Button buttonDsharp;
    private Button buttonE;
    private Button buttonF;
    private Button buttonFsharp;
    private Button buttonG;
    private Button buttonGsharp;
    private SoundPool soundPool;
    private Button buttonScale;
    private Button buttonEscale;

    private NumberPicker times;
    private NumberPicker notes;
    private Button buttonchallenge2;
    private Button twinkle;
    private Button newSong;

    private int noteA;
    private int noteB;
    private int noteBb;
    private int noteC;
    private int noteCsharp;
    private int noteD;
    private int noteDsharp;
    private int noteE;
    private int noteF;
    private int noteFsharp;
    private int noteG;
    private int noteGsharp;

    private int notehighA;
    private int notehighB;
    private int notehighBb;
    private int notehighC;
    private int notehighCsharp;
    private int notehighD;
    private int notehighDsharp;
    private int notehighE;
    private int notehighF;
    private int notehighFsharp;
    private int notehighG;
    private int notehighGsharp;

    private int notehighhighA;
    private int notehighhighB;
    private int  notehighhighC;
    private int  notehighhighD;
    private int  notehighhighE;
    private int  notehighhighFsharp;
    private int  notehighhighG;
    private int  notehighhighhighA;
    private int  notehighhighhighB;




    private Button buttonhighA;
    private Button buttonhighBB;
    private Button buttonhighB;
    private Button buttonhighC;
    private Button buttonhighCsharp;
    private Button buttonhighD;
    private Button buttonhighDsharp;
    private Button buttonhighE;
    private Button buttonhighF;
    private Button buttonhighFsharp;
    private Button buttonhighG;
    private Button buttonhighGsharp;


    private Map<Integer, Integer> noteMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        wireWidgets();
        setListeners();
        initializeSoundPool();
        initializeNoteMap();
        initializeNumberPickers();

    }



    private void initializeNoteMap() {
        noteMap = new HashMap<>();
        noteMap.put(R.id.button_synth_a, noteA);
        noteMap.put(R.id.button_synth_b, noteB);
        noteMap.put(R.id.button_synth_bb, noteBb);
        noteMap.put(R.id.button_synth_c, noteC);
        noteMap.put(R.id.button_synth_cc, noteCsharp);
        noteMap.put(R.id.button_synth_d, noteD);
        noteMap.put(R.id.button_synth_dd, noteDsharp);
        noteMap.put(R.id.button_synth_e, noteE);
        noteMap.put(R.id.button_synth_f, noteF);
        noteMap.put(R.id.button_synth_ff, noteFsharp);
        noteMap.put(R.id.button_synth_g, noteG);
        noteMap.put(R.id.button_synth_gg, noteGsharp);

        noteMap.put(R.id.button_synth_higha, notehighA);
        noteMap.put(R.id.button_synth_highb, notehighB);
        noteMap.put(R.id.button_synth_highbb, notehighBb);
        noteMap.put(R.id.button_synth_highc, notehighC);
        noteMap.put(R.id.button_synth_highcc, notehighCsharp);
        noteMap.put(R.id.button_synth_highd, notehighD);
        noteMap.put(R.id.button_synth_highdd, notehighDsharp);
        noteMap.put(R.id.button_synth_highe, notehighE);
        noteMap.put(R.id.button_synth_highf, notehighF);
        noteMap.put(R.id.button_synth_highff, notehighFsharp);
        noteMap.put(R.id.button_synth_highg, notehighG);
        noteMap.put(R.id.button_synth_highgg, notehighGsharp);


    }

    private void initializeSoundPool() {
        soundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        noteA = soundPool.load(this, R.raw.scalea, 1);
        noteB = soundPool.load(this, R.raw.scaleb, 1);
        noteBb = soundPool.load(this, R.raw.scalebb, 1);
        noteC = soundPool.load(this, R.raw.scalec, 1);
        noteCsharp = soundPool.load(this, R.raw.scalecs, 1);
        noteD = soundPool.load(this, R.raw.scaled, 1);
        noteDsharp = soundPool.load(this, R.raw.scaleds, 1);
        noteE = soundPool.load(this, R.raw.scalee, 1);
        noteF = soundPool.load(this, R.raw.scalef, 1);
        noteFsharp = soundPool.load(this, R.raw.scalefs, 1);
        noteG = soundPool.load(this, R.raw.scaleg, 1);
        noteGsharp = soundPool.load(this, R.raw.scalegs, 1);

        notehighA = soundPool.load(this, R.raw.scalehigha, 1);
        notehighB = soundPool.load(this, R.raw.scalehighb, 1);
        notehighBb = soundPool.load(this, R.raw.scalehighbb, 1);
        notehighC = soundPool.load(this, R.raw.scalehighc, 1);
        notehighCsharp = soundPool.load(this, R.raw.scalehighcs, 1);
        notehighD = soundPool.load(this, R.raw.scalehighd, 1);
        notehighDsharp = soundPool.load(this, R.raw.scalehighds, 1);
        notehighE = soundPool.load(this, R.raw.scalehighe, 1);
        notehighF = soundPool.load(this, R.raw.scalehighf, 1);
        notehighFsharp = soundPool.load(this, R.raw.scalehighfs, 1);
        notehighG = soundPool.load(this, R.raw.scalehighg, 1);

        notehighGsharp = soundPool.load(this, R.raw.scalehighgs, 1);
        notehighhighA = soundPool.load(this, R.raw.scalehighhigha, 1);
        notehighhighB = soundPool.load(this, R.raw.scalehighhighb, 1);
        notehighhighC = soundPool.load(this, R.raw.scalehighhighc, 1);
        notehighhighD = soundPool.load(this, R.raw.scalehighhighd, 1);
        notehighhighE = soundPool.load(this, R.raw.scalehighhighe, 1);
        notehighhighFsharp = soundPool.load(this, R.raw.scalehighhighfsharp, 1);
        notehighhighG = soundPool.load(this, R.raw.scalehighhighg, 1);
        notehighhighhighA = soundPool.load(this, R.raw.scalehighhighhigha, 1);
        notehighhighhighB = soundPool.load(this, R.raw.scalehighhighhighb, 1);





    }

    private void setListeners() {


        KeyboardNoteListener noteListener = new KeyboardNoteListener();

        buttonhighA.setOnClickListener(noteListener);
        buttonhighBB.setOnClickListener(noteListener);
        buttonhighB.setOnClickListener(noteListener);
        buttonhighC.setOnClickListener(noteListener);
        buttonhighCsharp.setOnClickListener(noteListener);
        buttonhighD.setOnClickListener(noteListener);
        buttonhighDsharp.setOnClickListener(noteListener);
        buttonhighE.setOnClickListener(noteListener);
        buttonhighF.setOnClickListener(noteListener);
        buttonhighFsharp.setOnClickListener(noteListener);
        buttonhighG.setOnClickListener(noteListener);
        buttonhighGsharp.setOnClickListener(noteListener);


        buttonA.setOnClickListener(noteListener);
        buttonBB.setOnClickListener(noteListener);
        buttonB.setOnClickListener(noteListener);
        buttonC.setOnClickListener(noteListener);
        buttonCsharp.setOnClickListener(noteListener);
        buttonD.setOnClickListener(noteListener);
        buttonDsharp.setOnClickListener(noteListener);
        buttonE.setOnClickListener(noteListener);
        buttonF.setOnClickListener(noteListener);
        buttonFsharp.setOnClickListener(noteListener);
        buttonG.setOnClickListener(noteListener);
        buttonGsharp.setOnClickListener(noteListener);
        buttonScale.setOnClickListener(this);
        buttonEscale.setOnClickListener(this);
        buttonchallenge2.setOnClickListener(this);
        times.setOnClickListener(this);
        notes.setOnClickListener(this);
        twinkle.setOnClickListener(this);
        newSong.setOnClickListener(this);
    }

    private void wireWidgets() {
        buttonA = findViewById(R.id.button_synth_a);
        buttonBB = findViewById(R.id.button_synth_bb);
        buttonB = findViewById(R.id.button_synth_b);
        buttonC = findViewById(R.id.button_synth_c);
        buttonCsharp = findViewById(R.id.button_synth_cc);
        buttonD = findViewById(R.id.button_synth_d);
        buttonDsharp = findViewById(R.id.button_synth_dd);
        buttonE = findViewById(R.id.button_synth_e);
        buttonF = findViewById(R.id.button_synth_f);
        buttonFsharp = findViewById(R.id.button_synth_ff);
        buttonG = findViewById(R.id.button_synth_g);
        buttonGsharp = findViewById(R.id.button_synth_gg);
        buttonScale = findViewById(R.id.button_synth_scale);
        buttonEscale = findViewById(R.id.button_synth_escale);

        buttonhighA = findViewById(R.id.button_synth_higha);
        buttonhighBB = findViewById(R.id.button_synth_highbb);
        buttonhighB = findViewById(R.id.button_synth_highb);
        buttonhighC = findViewById(R.id.button_synth_highc);
        buttonhighCsharp = findViewById(R.id.button_synth_highcc);
        buttonhighD = findViewById(R.id.button_synth_highd);
        buttonhighDsharp = findViewById(R.id.button_synth_highdd);
        buttonhighE = findViewById(R.id.button_synth_highe);
        buttonhighF = findViewById(R.id.button_synth_highf);
        buttonhighFsharp = findViewById(R.id.button_synth_highff);
        buttonhighG = findViewById(R.id.button_synth_highg);
        buttonhighGsharp = findViewById(R.id.button_synth_highgg);
        buttonchallenge2 = findViewById(R.id.button_synth_challenge2);

       times = findViewById(R.id.numberpicker_synth_times);
       notes = findViewById(R.id.numberPicker_synth_Notes);
       twinkle = findViewById(R.id.button_synth_twinkle);
       newSong = findViewById(R.id.button_synth_song);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button_synth_scale:
                playScale();
                break;

            case R.id.button_synth_escale:
                playEscale();
                break;

            case R.id.button_synth_challenge2:
                playChallenge2();
                break;
            case R.id.button_synth_twinkle:
                playTwinkle();
                break;
            case R.id.button_synth_song:
                playNewSong();
                break;



        }
    }

    private void playNewSong() {
        Song scale = new Song();

        scale.add(new Note(notehighhighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighFsharp, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighG, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighhighB, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighFsharp, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighG, 0));
        scale.add(new Note(notehighhighG, Note.WHOLE_NOTE/ 3 * 2));
        scale.add(new Note(notehighhighhighB, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighhighB, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighG, Note.WHOLE_NOTE/ 3 ));
        scale.add(new Note(notehighhighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighG, Note.WHOLE_NOTE / 6 ));
        scale.add(new Note(notehighhighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighG, Note.WHOLE_NOTE /2 ));


        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, 0));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE/ 3));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3 * 2));
        delay(Note.WHOLE_NOTE/6);
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighD, 0));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE/ 3));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3 * 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighC, 0));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE * 2));
        delay(Note.WHOLE_NOTE/2);

        scale.add(new Note(notehighD, Note.WHOLE_NOTE/3));
        scale.add(new Note(notehighC, 0));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 3 * 2));

        scale.add(new Note(notehighD, Note.WHOLE_NOTE/3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 3 * 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighB, 0));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE/ 3));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE /2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighB, 0));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE/ 3));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3 * 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighC, 0));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE/2 ));

        scale.add(new Note(notehighD, Note.WHOLE_NOTE/3));
        scale.add(new Note(notehighC, 0));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 3 * 2));
        scale.add(new Note(notehighD, Note.WHOLE_NOTE/3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE  / 2));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE/ 3));
        scale.add(new Note(notehighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE /2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE/ 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE /2));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE/ 3));
        scale.add(new Note(notehighhighA, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE /2));
        scale.add(new Note(notehighD, Note.WHOLE_NOTE/3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighD, Note.WHOLE_NOTE/3));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 3));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE / 6));
        scale.add(new Note(notehighhighB, Note.WHOLE_NOTE ));
























































        playSong(scale);
    }



    private void playTwinkle() {

        Song scale = new Song();

        scale.add(new Note(noteA, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteA, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE));
        scale.add(new Note(noteD, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteD, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteCsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteCsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteA, Note.WHOLE_NOTE));

        for (int i = 0; i < 2; i++) {
            scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));
            scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));
            scale.add(new Note(noteD, Note.WHOLE_NOTE / 2));
            scale.add(new Note(noteD, Note.WHOLE_NOTE / 2));
            scale.add(new Note(noteCsharp, Note.WHOLE_NOTE / 2));
            scale.add(new Note(noteCsharp, Note.WHOLE_NOTE / 2));
            scale.add(new Note(noteB, Note.WHOLE_NOTE));
        }

        scale.add(new Note(noteA, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteA, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE));
        scale.add(new Note(noteD, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteD, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteCsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteCsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteA, Note.WHOLE_NOTE));

        playSong(scale);
    }

    private void playChallenge2() {
        int [] note = new int [] { noteA, noteB, noteBb, noteC, noteCsharp, noteD, noteDsharp, noteE, noteF, noteFsharp, noteG, noteGsharp,
                notehighA, notehighB, notehighBb, notehighC, notehighCsharp, notehighD, notehighDsharp, notehighE, notehighF, notehighFsharp, notehighG, notehighGsharp } ;

        for(int i = 0; i <  times.getValue(); i ++)
        {
          playNote(note[notes.getValue()]);
          delay(1000);

        }

    }


    private void initializeNumberPickers() {
        String[] note = new String []{"A" , "B", "B♭" , "C", "C# " ,"D", "D#", "E", "F", "F#", "G", "G#",
                                      "highA" , "highB", "highB♭" , "highC", "highC# " ,"highD", "highD#", "highE", "highF", "highF#", "highG", "highG#" };


        notes.setMaxValue(23);
        notes.setMinValue(0);
        notes.setDisplayedValues(note);
        times.setMinValue(0);
        times.setMaxValue(20);

    }




    private void playEscale() {
        Song scale = new Song();

        scale.add(new Note(noteE, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteFsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteG, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighA, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighCsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighD, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));

        playSong(scale);
    }




    private void playScale() {

        Song scale = new Song();

        scale.add(new Note(noteA, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteBb, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteC, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteCsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteD, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteDsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteE, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteF, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteFsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteG, Note.WHOLE_NOTE / 2));
        scale.add(new Note(noteGsharp, Note.WHOLE_NOTE / 2));

        scale.add(new Note(notehighA, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighB, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighBb, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighC, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighCsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighD, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighDsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighE, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighF, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighFsharp, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighG, Note.WHOLE_NOTE / 2));
        scale.add(new Note(notehighGsharp, Note.WHOLE_NOTE / 2));

        playSong(scale);


    }


    private void playSong(Song scale) {
        for (Note note : scale.getNotes()) {
            playNote(note);
            delay(note.getDelay());
        }
    }

        private void delay(int duration){
            try {
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        private void playNote(int note,int loop){
            soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY, loop, DEFAULT_RATE);

        }

        private void playNote (int note){
            playNote(note, 0);

        }

        private void playNote (Note note){
          playNote(note.getNoteid(), 0);
        }

        private class KeyboardNoteListener implements View.OnClickListener
        {
            @Override
            public void onClick(View view){
                int id = view.getId();
                int note = noteMap.get(id);
                playNote(note);
            }
        }

    }


