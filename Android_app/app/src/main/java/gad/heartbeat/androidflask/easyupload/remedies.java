package gad.heartbeat.androidflask.easyupload;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class remedies extends Fragment {
    ViewPager viewPager;
    ViewPager viewPager1;
    ViewPager viewPager2;
    Adapter adapter;
    Adapter1 adapter1;
    Adapter adapter2;
    List<Model> models;
    List<Model> models1;
    List<Model> models2;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private static final String TAG = "remedies";
    public remedies() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_remedies, container, false);
        TextView resp = (TextView) v.findViewById(R.id.resp);
        String value = getArguments().getString("Key");
        resp.setText(getArguments().getString("Key"));
        Log.d(TAG, "onCreateView: " + value);
        if(value.equalsIgnoreCase("Acne")){
            models = new ArrayList<>();
            models.add(new Model(R.drawable.acne1, "Cleaning your skin daily with a mild soap to remove excess oil and dirt", ""));
            models.add(new Model(R.drawable.acne2, "Shampooing your hair regularly and keeping it out of your face", ""));
            models.add(new Model(R.drawable.acne3, "Not touching your face", ""));
            models.add(new Model(R.drawable.acne4, "not squeezing or picking pimples, which spreads bacteria and excess oil", ""));

            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.acneprev1, "Washing your face twice a day with an oil-free cleanser", ""));
            models1.add(new Model(R.drawable.acneprev2, "Removing makeup and cleaning your skin thoroughly before bed", ""));
            models1.add(new Model(R.drawable.acneprev3, "Avoiding makeup that contains oil", ""));
            models1.add(new Model(R.drawable.acneprev4, "Eating a healthy diet with minimal refined sugars", ""));

            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.acnerec1, "Benzoyl Peroxide 10% Wash", ""));
            models2.add(new Model(R.drawable.acnerec2, "Clean and Clear Continuous Control Acne Cleanser", ""));
            models2.add(new Model(R.drawable.acnerec3, "Proactiv+ Skin Smoothing Exfoliator", ""));
            models2.add(new Model(R.drawable.acnerec4, "Clean & Clear Advantage Acne Control Kit", ""));

        }
        else if(value.equalsIgnoreCase("Amelanotic")){
            models = new ArrayList<>();
            models.add(new Model(R.drawable.amelanotic1, "Biological therapy, or drugs that aid your immune system in killing cancer cells, including pembrolizumab (Keytruda) and ipilimumab (Yervoy)", ""));
            models.add(new Model(R.drawable.amelanotic2, "Targeted therapy, or medications that help weaken cancer cells, including trametinib (Mekinist) and vemurafenib (Zelboraf).", ""));
            models.add(new Model(R.drawable.amelanotic3, "Yervoy Injection", ""));
            models.add(new Model(R.drawable.amelanotic4, "If its not tolerable then please do consult the Doctor", ""));

            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.amelanoticprev1, "Apply sunscreen each time you go outside for 30 minutes or longer. This is especially important if you plan to be in direct sunlight.", ""));
            models1.add(new Model(R.drawable.amelanoticprev2, "Use sunscreen even on cloudy days. UV rays can still pass through clouds.", ""));
            models1.add(new Model(R.drawable.amelanoticprev3, "Avoid tanning salons or beds", ""));

            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.amel1, "Lakme Sun Expert", ""));
            models2.add(new Model(R.drawable.amel2, "Lotus Herbals Safe Sun", ""));
            models2.add(new Model(R.drawable.amel3, "Nivea Sun", ""));

        }
        else if(value.equalsIgnoreCase("Dermatitis")){
            models = new ArrayList<>();
            models.add(new Model(R.drawable.dermatitis1, "Most cases of contact dermatitis go away on their own once the substance is no longer in contact with the skin.", ""));
            models.add(new Model(R.drawable.dermatitis2, "Avoid scratching your irritated skin. Scratching can make the irritation worse or even cause a skin infection that requires antibiotics.", ""));
            models.add(new Model(R.drawable.dermatitis3, "Clean your skin with mild soap and lukewarm water to remove any irritants.", ""));
            models.add(new Model(R.drawable.dermatitis4, "Stop using any products you think might be causing the problem.", ""));

            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.dermatitisprev1, "Purchase products labeled “hypoallergenic” or “unscented.”", ""));
            models1.add(new Model(R.drawable.dermatitisprev2, "Refrain from wearing latex gloves if you have a latex allergy. Opt for vinyl gloves instead.", ""));
            models1.add(new Model(R.drawable.dermatitisprev3, "Wear long-sleeved shirts and pants when hiking in the wilderness.", ""));
            models1.add(new Model(R.drawable.dermatitisprev4, "If you notice irritation from a new product, stop using it immediately.", ""));

            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.der1, "Vaseline", ""));
            models2.add(new Model(R.drawable.der5, "Calamine Lotion", ""));
            models2.add(new Model(R.drawable.der4, "Diphenhydramine", ""));
            models2.add(new Model(R.drawable.derma3, "Hydrocortisone cream ", ""));

        }
        else if(value.equalsIgnoreCase("Myxoid")){
            models = new ArrayList<>();
            models.add(new Model(R.drawable.dermatitis1, "Most cases of contact Myxoid go away on their own once the substance is no longer in contact with the skin.", ""));
            models.add(new Model(R.drawable.dermatitis2, "Avoid scratching your irritated skin. Scratching can make the irritation worse or even cause a skin infection that requires antibiotics.", ""));
            models.add(new Model(R.drawable.ringworm2, "Keep your skin clean and dry", ""));
            models.add(new Model(R.drawable.ringworm4, "Don’t share clothing, towels, sheets, or other personal items with someone who has ringworm and do not touch your face", ""));

            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.ringwormprev1, "Wash your hands with soap and running water after playing with pets. If you suspect that your pet has ringworm, take it to see a veterinarian. ", ""));
            models1.add(new Model(R.drawable.ringwormprev4, "Wear shoes that allow air to circulate freely around your feet.", ""));

            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.ring1, "Ketomac Cream", ""));
            models2.add(new Model(R.drawable.ring2, "Four Derm", ""));
            models2.add(new Model(R.drawable.ring3, "Daktarin Gel", ""));
            models2.add(new Model(R.drawable.ring4, "Zeasorb", ""));
        }
        else if(value.equalsIgnoreCase("Ringworm")){
            models = new ArrayList<>();
            models.add(new Model(R.drawable.ringworm2, "Keep your skin clean and dry", ""));
            models.add(new Model(R.drawable.ringworm4, "Don’t share clothing, towels, sheets, or other personal items with someone who has ringworm and do not touch your face", ""));

            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.ringwormprev1, "Wash your hands with soap and running water after playing with pets. If you suspect that your pet has ringworm, take it to see a veterinarian. ", ""));
            models1.add(new Model(R.drawable.ringwormprev4, "Wear shoes that allow air to circulate freely around your feet.", ""));

            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.ring1, "Ketomac Cream", ""));
            models2.add(new Model(R.drawable.ring2, "Four Derm", ""));
            models2.add(new Model(R.drawable.ring3, "Daktarin Gel", ""));
            models2.add(new Model(R.drawable.ring4, "Zeasorb", ""));

        }

        else if(value.equalsIgnoreCase("Fine")) {
            models = new ArrayList<>();
            models.add(new Model(R.drawable.acne1, "Cleaning your skin daily with a mild soap to remove excess oil and dirt", ""));
            models.add(new Model(R.drawable.acne2, "Shampooing your hair regularly and keeping it out of your face", ""));
            models.add(new Model(R.drawable.acne3, "Not touching your face", ""));


            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.acneprev1, "Washing your face twice a day with an oil-free cleanser", ""));
            models1.add(new Model(R.drawable.acneprev2, "Removing makeup and cleaning your skin thoroughly before bed", ""));
            models1.add(new Model(R.drawable.acneprev3, "Avoiding makeup that contains oil", ""));
            models1.add(new Model(R.drawable.acneprev4, "Eating a healthy diet with minimal refined sugars", ""));

            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.amel3, "Nivea Sun", ""));
            models2.add(new Model(R.drawable.acnerec2, "Clean and Clear Continuous Control Acne Cleanser", ""));
            models2.add(new Model(R.drawable.acnerec3, "Proactiv+ Skin Smoothing Exfoliator", ""));
            models2.add(new Model(R.drawable.acnerec4, "Clean & Clear Advantage Acne Control Kit", ""));
        }

        else if(value.equalsIgnoreCase("You already look young")) {
            models = new ArrayList<>();
            models.add(new Model(R.drawable.you1, "Chemicals can be extremely damaging to your skin,\" shares Dr. Deepali. Opt for natural and herbal ingredients. Identify your skin and choose products accordingly.", ""));
            models.add(new Model(R.drawable.you2, "Water, water, water! How many times will you turn away from the fact that drinking - at least - 2-3 litres of water is a must for healthy functioning of your body.", ""));
            models.add(new Model(R.drawable.you3, "\"An easy at-home regimen would be using a retinol cream,\" says Dr. John Kahan, a surgeon who treats patients at Beverly Hills Med Spa. ", ""));


            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.you4, "\"Weight gain is also perceived as aging in several areas,\" says Dr. Joshua D. Zuckerman, MD, FACS, a board-certified plastic surgeon practicing in Manhattan.", ""));
            models1.add(new Model(R.drawable.you5, "Sugar does more than just rot your teeth, it's also a major contributor to the loss of firmness in the skin, which can age you significantly.", ""));
            models1.add(new Model(R.drawable.you6, "Those late nights you pulled in college are doing no favors to your skin. In fact, they could be the reason you're looking a little worse for wear. \"Sleep is one of the most important physiological processes,\"", ""));


            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.amel3, "Nivea Sun", ""));
            models2.add(new Model(R.drawable.acnerec2, "Clean and Clear Continuous Control Acne Cleanser", ""));
            models2.add(new Model(R.drawable.acnerec3, "Proactiv+ Skin Smoothing Exfoliator", ""));
            models2.add(new Model(R.drawable.acnerec4, "Clean & Clear Advantage Acne Control Kit", ""));
        }

        else if(value.equalsIgnoreCase("Have patience and follow the tips")) {
            models = new ArrayList<>();
            models.add(new Model(R.drawable.old1, "Eggs can do wonders for your overall health.All you need to do is whip up some egg whites in a bowl and apply it on your skin directly. Massage it light and allow it to sit for 15 minutes.", ""));
            models.add(new Model(R.drawable.old2, "Olive oil is another natural and effective home remedy for wrinkles. All you need to do is massage a few drops of this oil on your skin before bedtime. Now clean it with a towel", ""));
            models.add(new Model(R.drawable.old3, "This vitamin C rich fruit can be a great way to treat wrinkles naturally. Just slice some lemon and squeeze its juice into your fine lines and massage it all over.", ""));


            models1 = new ArrayList<>();
            models1.add(new Model(R.drawable.old4, "Aloe vera is rich in malic acid which improves skin elasticity. All you need to do is take some gel from the leave and apply it on your skin as it is. Wait for 15 minutes or till it dries and then wash it off. ", ""));
            models1.add(new Model(R.drawable.old5, "Hygiene is another factor which can either help or hurt your skin as neglected skin shows signs of aging and trauma much faster than someone who treats their skin with respect.", ""));
            models1.add(new Model(R.drawable.old5, "If you want to avoid pock marks and scarring that can make you look older, stop picking at your skin pronto. \"Stop picking at those pesky breakouts and let them come out on their own or use natural products to help eliminate them\"", ""));


            models2 = new ArrayList<>();
            models2.add(new Model(R.drawable.final1, "A chemical peel can diminish many signs of aging on the face as well as the hands, neck, and chest. These treatments work by removing layers of the skin.", ""));
            models2.add(new Model(R.drawable.final2, "Laser resurfacing gives the fastest results out of all the nonsurgical skin tightening methods. After healing, fewer wrinkles will be visible within 2 weeks. However, this does come with a downtime of 5–7 days.", ""));
            models2.add(new Model(R.drawable.final3, "Botulinum toxin therapy is a noninvasive procedure that helps to diminish signs of aging by relaxing facial muscles.", ""));

        }


        adapter2 = new Adapter(models1,getActivity());
        adapter = new Adapter(models,getActivity());
        adapter1 = new Adapter1(models2,getActivity());

        viewPager = v.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0 ,130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };
        colors = colors_temp;
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() -1) && position < (colors.length - 1)) {
                    v.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager1.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager2.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        viewPager1 = v.findViewById(R.id.viewPager1);
        viewPager1.setAdapter(adapter2);
        viewPager1.setPadding(130, 0 ,130, 0);
        viewPager1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter2.getCount() -1) && position < (colors.length - 1)) {
                    v.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager1.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager2.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager1.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        viewPager2 = v.findViewById(R.id.viewPager2);
        viewPager2.setAdapter(adapter1);
        viewPager2.setPadding(250, 0 ,250, 0);

        viewPager2.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter1.getCount() -1) && position < (colors.length - 1)) {
                    v.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager1.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                    viewPager2.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager1.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        return v;
    }
}
