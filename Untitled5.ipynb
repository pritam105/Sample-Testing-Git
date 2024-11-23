{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 1,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Requirement already satisfied: tensorflow in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (2.18.0)\n",
      "Requirement already satisfied: absl-py>=1.0.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (2.1.0)\n",
      "Requirement already satisfied: astunparse>=1.6.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (1.6.3)\n",
      "Requirement already satisfied: flatbuffers>=24.3.25 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (24.3.25)\n",
      "Requirement already satisfied: gast!=0.5.0,!=0.5.1,!=0.5.2,>=0.2.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (0.6.0)\n",
      "Requirement already satisfied: google-pasta>=0.1.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (0.2.0)\n",
      "Requirement already satisfied: libclang>=13.0.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (18.1.1)\n",
      "Requirement already satisfied: opt-einsum>=2.3.2 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (3.4.0)\n",
      "Requirement already satisfied: packaging in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (24.2)\n",
      "Requirement already satisfied: protobuf!=4.21.0,!=4.21.1,!=4.21.2,!=4.21.3,!=4.21.4,!=4.21.5,<6.0.0dev,>=3.20.3 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (5.27.2)\n",
      "Requirement already satisfied: requests<3,>=2.21.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (2.31.0)\n",
      "Requirement already satisfied: setuptools in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (65.5.0)\n",
      "Requirement already satisfied: six>=1.12.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (1.16.0)\n",
      "Requirement already satisfied: termcolor>=1.1.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (2.5.0)\n",
      "Requirement already satisfied: typing-extensions>=3.6.6 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (4.12.2)\n",
      "Requirement already satisfied: wrapt>=1.11.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (1.16.0)\n",
      "Requirement already satisfied: grpcio<2.0,>=1.24.3 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (1.67.1)\n",
      "Requirement already satisfied: tensorboard<2.19,>=2.18 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (2.18.0)\n",
      "Requirement already satisfied: keras>=3.5.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (3.6.0)\n",
      "Requirement already satisfied: numpy<2.1.0,>=1.26.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (2.0.1)\n",
      "Requirement already satisfied: h5py>=3.11.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (3.12.1)\n",
      "Requirement already satisfied: ml-dtypes<0.5.0,>=0.4.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (0.4.1)\n",
      "Requirement already satisfied: tensorflow-io-gcs-filesystem>=0.23.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorflow) (0.37.1)\n",
      "Requirement already satisfied: wheel<1.0,>=0.23.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from astunparse>=1.6.0->tensorflow) (0.40.0)\n",
      "Requirement already satisfied: rich in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from keras>=3.5.0->tensorflow) (13.9.4)\n",
      "Requirement already satisfied: namex in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from keras>=3.5.0->tensorflow) (0.0.8)\n",
      "Requirement already satisfied: optree in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from keras>=3.5.0->tensorflow) (0.13.1)\n",
      "Requirement already satisfied: charset-normalizer<4,>=2 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from requests<3,>=2.21.0->tensorflow) (3.1.0)\n",
      "Requirement already satisfied: idna<4,>=2.5 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from requests<3,>=2.21.0->tensorflow) (3.4)\n",
      "Requirement already satisfied: urllib3<3,>=1.21.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from requests<3,>=2.21.0->tensorflow) (2.0.2)\n",
      "Requirement already satisfied: certifi>=2017.4.17 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from requests<3,>=2.21.0->tensorflow) (2023.5.7)\n",
      "Requirement already satisfied: markdown>=2.6.8 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorboard<2.19,>=2.18->tensorflow) (3.7)\n",
      "Requirement already satisfied: tensorboard-data-server<0.8.0,>=0.7.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorboard<2.19,>=2.18->tensorflow) (0.7.2)\n",
      "Requirement already satisfied: werkzeug>=1.0.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from tensorboard<2.19,>=2.18->tensorflow) (3.0.3)\n",
      "Requirement already satisfied: MarkupSafe>=2.1.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from werkzeug>=1.0.1->tensorboard<2.19,>=2.18->tensorflow) (2.1.5)\n",
      "Requirement already satisfied: markdown-it-py>=2.2.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from rich->keras>=3.5.0->tensorflow) (3.0.0)\n",
      "Requirement already satisfied: pygments<3.0.0,>=2.13.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from rich->keras>=3.5.0->tensorflow) (2.18.0)\n",
      "Requirement already satisfied: mdurl~=0.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from markdown-it-py>=2.2.0->rich->keras>=3.5.0->tensorflow) (0.1.2)\n",
      "\n",
      "\u001b[1m[\u001b[0m\u001b[34;49mnotice\u001b[0m\u001b[1;39;49m]\u001b[0m\u001b[39;49m A new release of pip is available: \u001b[0m\u001b[31;49m23.1.2\u001b[0m\u001b[39;49m -> \u001b[0m\u001b[32;49m24.3.1\u001b[0m\n",
      "\u001b[1m[\u001b[0m\u001b[34;49mnotice\u001b[0m\u001b[1;39;49m]\u001b[0m\u001b[39;49m To update, run: \u001b[0m\u001b[32;49mpip install --upgrade pip\u001b[0m\n",
      "Note: you may need to restart the kernel to use updated packages.\n"
     ]
    }
   ],
   "source": [
    "pip install tensorflow"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 9,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Collecting matplotlib\n",
      "  Downloading matplotlib-3.9.2-cp310-cp310-macosx_11_0_arm64.whl (7.8 MB)\n",
      "\u001b[2K     \u001b[90m━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\u001b[0m \u001b[32m7.8/7.8 MB\u001b[0m \u001b[31m3.1 MB/s\u001b[0m eta \u001b[36m0:00:00\u001b[0m00:01\u001b[0m00:01\u001b[0m\n",
      "\u001b[?25hCollecting contourpy>=1.0.1 (from matplotlib)\n",
      "  Downloading contourpy-1.3.1-cp310-cp310-macosx_11_0_arm64.whl (253 kB)\n",
      "\u001b[2K     \u001b[90m━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\u001b[0m \u001b[32m253.3/253.3 kB\u001b[0m \u001b[31m4.5 MB/s\u001b[0m eta \u001b[36m0:00:00\u001b[0ma \u001b[36m0:00:01\u001b[0m\n",
      "\u001b[?25hCollecting cycler>=0.10 (from matplotlib)\n",
      "  Downloading cycler-0.12.1-py3-none-any.whl (8.3 kB)\n",
      "Collecting fonttools>=4.22.0 (from matplotlib)\n",
      "  Downloading fonttools-4.55.0-cp310-cp310-macosx_10_9_universal2.whl (2.8 MB)\n",
      "\u001b[2K     \u001b[90m━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\u001b[0m \u001b[32m2.8/2.8 MB\u001b[0m \u001b[31m4.6 MB/s\u001b[0m eta \u001b[36m0:00:00\u001b[0ma \u001b[36m0:00:01\u001b[0m\n",
      "\u001b[?25hCollecting kiwisolver>=1.3.1 (from matplotlib)\n",
      "  Downloading kiwisolver-1.4.7-cp310-cp310-macosx_11_0_arm64.whl (64 kB)\n",
      "\u001b[2K     \u001b[90m━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\u001b[0m \u001b[32m64.3/64.3 kB\u001b[0m \u001b[31m4.3 MB/s\u001b[0m eta \u001b[36m0:00:00\u001b[0m\n",
      "\u001b[?25hRequirement already satisfied: numpy>=1.23 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from matplotlib) (2.0.1)\n",
      "Requirement already satisfied: packaging>=20.0 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from matplotlib) (24.2)\n",
      "Collecting pillow>=8 (from matplotlib)\n",
      "  Downloading pillow-11.0.0-cp310-cp310-macosx_11_0_arm64.whl (3.0 MB)\n",
      "\u001b[2K     \u001b[90m━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\u001b[0m \u001b[32m3.0/3.0 MB\u001b[0m \u001b[31m5.3 MB/s\u001b[0m eta \u001b[36m0:00:00\u001b[0m00:01\u001b[0m00:01\u001b[0m\n",
      "\u001b[?25hRequirement already satisfied: pyparsing>=2.3.1 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from matplotlib) (3.1.2)\n",
      "Requirement already satisfied: python-dateutil>=2.7 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from matplotlib) (2.9.0.post0)\n",
      "Requirement already satisfied: six>=1.5 in /Library/Frameworks/Python.framework/Versions/3.10/lib/python3.10/site-packages (from python-dateutil>=2.7->matplotlib) (1.16.0)\n",
      "Installing collected packages: pillow, kiwisolver, fonttools, cycler, contourpy, matplotlib\n",
      "Successfully installed contourpy-1.3.1 cycler-0.12.1 fonttools-4.55.0 kiwisolver-1.4.7 matplotlib-3.9.2 pillow-11.0.0\n",
      "\n",
      "\u001b[1m[\u001b[0m\u001b[34;49mnotice\u001b[0m\u001b[1;39;49m]\u001b[0m\u001b[39;49m A new release of pip is available: \u001b[0m\u001b[31;49m23.1.2\u001b[0m\u001b[39;49m -> \u001b[0m\u001b[32;49m24.3.1\u001b[0m\n",
      "\u001b[1m[\u001b[0m\u001b[34;49mnotice\u001b[0m\u001b[1;39;49m]\u001b[0m\u001b[39;49m To update, run: \u001b[0m\u001b[32;49mpip install --upgrade pip\u001b[0m\n",
      "Note: you may need to restart the kernel to use updated packages.\n"
     ]
    }
   ],
   "source": [
    "pip install matplotlib"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 10,
   "metadata": {
    "id": "2KQ7tvUqpj8U"
   },
   "outputs": [],
   "source": [
    "# prompt: import tensorflow as tf\n",
    "\n",
    "import tensorflow as tf\n",
    "import tensorflow.keras as keras\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 11,
   "metadata": {},
   "outputs": [],
   "source": [
    "import ssl\n",
    "ssl._create_default_https_context = ssl._create_unverified_context"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 12,
   "metadata": {
    "colab": {
     "base_uri": "https://localhost:8080/"
    },
    "id": "nLn79U0ep9eK",
    "outputId": "c6a42f1c-d942-4870-a5d6-d522d46d61b5"
   },
   "outputs": [],
   "source": [
    "mnist = tf.keras.datasets.mnist\n",
    "(x_train, y_train),(x_test, y_test) = mnist.load_data()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 13,
   "metadata": {
    "colab": {
     "base_uri": "https://localhost:8080/"
    },
    "id": "OiLnib1Zp-3N",
    "outputId": "2a401a33-bb85-4a23-e7db-0799178b8067"
   },
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "60000\n",
      "10000\n",
      "5\n"
     ]
    }
   ],
   "source": [
    "print(len(x_train))\n",
    "print(len(x_test))\n",
    "print(y_train[0])"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 14,
   "metadata": {
    "colab": {
     "base_uri": "https://localhost:8080/",
     "height": 430
    },
    "id": "k6oe53F-rmrS",
    "outputId": "cb9bf615-0ff3-4186-b4f4-d3cb9a2298ff"
   },
   "outputs": [
    {
     "name": "stderr",
     "output_type": "stream",
     "text": [
      "Matplotlib is building the font cache; this may take a moment.\n"
     ]
    },
    {
     "data": {
      "image/png": "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",
      "text/plain": [
       "<Figure size 640x480 with 1 Axes>"
      ]
     },
     "metadata": {},
     "output_type": "display_data"
    }
   ],
   "source": [
    "import matplotlib.pyplot as plt\n",
    "\n",
    "plt.imshow(x_train[0],cmap=plt.cm.binary)\n",
    "plt.show()\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "colab": {
   "provenance": []
  },
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.10.11"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 4
}
